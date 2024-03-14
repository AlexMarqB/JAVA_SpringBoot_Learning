package com.gm2.dev.first_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    public String getMessage() {
        return "Texto de configuração";
    }

    //notation a nivel de metódo
    //executa o metodo assim que a classe for instanciada
    @Bean
    public String init() {
        return "Bean";
    }
}
