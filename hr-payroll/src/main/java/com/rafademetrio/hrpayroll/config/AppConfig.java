package com.rafademetrio.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

// faz essa class para se ter o padrão singleton (quando se utiliza apenas 1 instancia para varias vezes no projeto)

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}



