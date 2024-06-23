package com.pventafe.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfing {

    @Bean
    @ConfigurationProperties(prefix = "datasource.my_cnx_mysql")
    public DataSource crudDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate crudJdbcTemplace(DataSource crudDataSource){
        var jdbcTemplace = new JdbcTemplate(crudDataSource);
        return jdbcTemplace;
    }

    @Bean
    public NamedParameterJdbcTemplate crudNamedParameterJdbcTemplace(JdbcTemplate crudJdbcTemplace){
        return new NamedParameterJdbcTemplate(crudJdbcTemplace);
    }

}
