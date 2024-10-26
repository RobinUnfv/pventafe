package com.pventafe.persistence.repository.implementation;

import com.pventafe.persistence.repository.interfaces.IComprobantePagoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ComprobantePagoImpRepo implements IComprobantePagoRepo {
    @Autowired
    private NamedParameterJdbcTemplate namedParameter;
    @Override
    public String emisionXml(String inputXml) {
        System.out.println(inputXml);
        try {
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(namedParameter.getJdbcTemplate())
                    .withSchemaName("FACTU")
                    .withCatalogName("PR_COMPROBANTE_PAGO")
                    .withProcedureName("EMISION_COMPRO_PAGO");

            //Parámetros de entra y salida
            SqlParameter inParam = new SqlParameter("p_cXmlInput", Types.CLOB);
            SqlParameter outParam = new SqlOutParameter("p_cXmlOutput", Types.CLOB);

            simpleJdbcCall.declareParameters(inParam, outParam);

            Map<String, Object> inParams = new HashMap<>();
            inParams.put("p_cXmlInput",inputXml);

            Map<String, Object> outParams = simpleJdbcCall.execute(inParams);
            Clob clobOutput = (Clob) outParams.get("p_cXmlOutput");
            // Convertir Clob a String
            String outputXml = clobToString(clobOutput);
            return outputXml;
        } catch (SQLException | DataAccessException | IOException e) {
            // Manejar la excepción específica de acceso a datos
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private String clobToString(Clob clob) throws SQLException, IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(clob.getAsciiStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }
}
