package com.pventafe.persistence.repository.implementation;

import com.pventafe.persistence.repository.interfaces.IComprobantePagoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ComprobantePagoImpRepo implements IComprobantePagoRepo {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public String emisionXml(String inputXml) {
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(namedParameterJdbcTemplate)
                .withProcedureName("FACTU.PR_COMPROBANTE_PAGO.EMISION_COMPRO_PAGO");

        //Parámetros de entra y salida
        SqlParameter inParam = new SqlParameter("cXMLIn", Types.CLOB);
        SqlParameter outParam = new SqlOutParameter("cXMLOut", Types.CLOB);

        simpleJdbcCall.declareParameters(inParam, outParam);

        Map<String, Object> inParam = new HashMap<>();
        inParam.put("cXMLIn",inputXml);

        Map<String, Object> outParam = simpleJdbcCall.execute(inParam);
        return (String) outParam.get("cXMLOut");
    }
}
