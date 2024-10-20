package com.pventafe.persistence.repository.implementation;

import com.pventafe.model.UsuarioMod;
import com.pventafe.persistence.repository.interfaces.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UsuarioImplRepo implements IUsuarioRepo {

    @Autowired
    private NamedParameterJdbcTemplate namedParameter;

    @Override
    public List<UsuarioMod> findUsuarioUserAndPassword(String user, String password) {
       StringBuilder query = new StringBuilder();
       query.append("SELECT U.USUARIO, U.NOMBRE,U.CENTRO,U.CENTRO_COSTO, C.TRANS_PTO_VENTA, U.COD_EMP, U.TIPUSUA, U.EMAIL, ");
       query.append("C.NO_CIA,C.NO_CLIENTE_ONLINE, C.RAZON_SOCIAL ");
       query.append("FROM FACTU.TAPUSU_PVEN U ");
       query.append("INNER JOIN FACTU.ARFAMC C ON U.NO_CIA = C.NO_CIA ");
       query.append("WHERE U.USUARIO = :user ");
       query.append("AND U.CLAVE = :password ");
       query.append("AND U.ESTADO = 'A'");

        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("user",user)
                .addValue("password", password);

        List<UsuarioMod> usuarios = namedParameter.query(query.toString(), parameterSource, new UsuarioRowMapper() );
        return usuarios;
    }

    private static final class UsuarioRowMapper implements RowMapper<UsuarioMod> {

        @Override
        public UsuarioMod mapRow(ResultSet rs, int rowNum) throws SQLException {
            UsuarioMod usuarioMod = new UsuarioMod();
            usuarioMod.setUsuario(rs.getString("USUARIO"));
            usuarioMod.setNombre(rs.getString("NOMBRE"));
            usuarioMod.setCentro(rs.getString("CENTRO"));
            usuarioMod.setCentroCosto(rs.getString("CENTRO_COSTO"));
            usuarioMod.setTransPtoVenta(rs.getString("TRANS_PTO_VENTA"));
            usuarioMod.setCodEmp(rs.getString("COD_EMP"));
            usuarioMod.setTipUsua(rs.getString("TIPUSUA"));
            usuarioMod.setEmail(rs.getString("EMAIL"));
            usuarioMod.setNoCia(rs.getString("NO_CIA"));
            usuarioMod.setNoClienteOnline(rs.getString("NO_CLIENTE_ONLINE"));
            usuarioMod.setRazonSocial(rs.getString("RAZON_SOCIAL"));
            return usuarioMod;
        }
    }

}
