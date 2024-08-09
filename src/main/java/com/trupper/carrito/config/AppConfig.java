package com.trupper.carrito.config;

import com.trupper.carrito.model.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.trupper.carrito.*"})
@PropertySource({"classpath:application.properties"})
public class AppConfig {

//    @Bean
//    public Cliente cliente() {
//        return new Cliente();
//    }
}
