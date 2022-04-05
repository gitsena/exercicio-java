
package com.mycompany.banco.java;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteBanco {
    public static void main(String[] args) {
        //Esse objeto guarda as configurações do banco de dados
        Connetion config = new Connetion();
        
        JdbcTemplate template = new JdbcTemplate(config.getDataSource());
        
        List listaPokemon1 = template.queryForList("select * from pokemon");
        System.out.println(listaPokemon1);
    }
}
