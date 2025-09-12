package com.crud.app;



import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); // endereço do sgbd  , endereço do drive , que se acha na documentoção e na formula , stc ouver flor e buscar 
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_java");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
    // conexao com o banco 

    @Bean 
    public JpaVendorAdapter JpaVendorAdapter () {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true); // para fazer o creat table 
        adapter.setDatabasePlatform("org.hibertnate.dialect.MySQL8Dialect");
        adapter.setPrepareConnection(true);


        return adapter;

    }
}
