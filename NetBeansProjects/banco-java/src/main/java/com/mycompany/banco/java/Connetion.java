package com.mycompany.banco.java;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connetion {
    private BasicDataSource dataSource;

    public Connetion() {
        // "./ " referencia o nome do diretorio "meu_banco" é o nome do meu banco
        dataSource = new BasicDataSource();
        dataSource​.setDriverClassName("org.h2.Driver");
        dataSource​.setUrl("jdbc:h2:file:./meu_banco");
        dataSource​.setUsername("sa");
        dataSource​.setPassword("");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
    
    
}
