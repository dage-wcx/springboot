package com.example.demo.exception;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class MyException4 {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver smer = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        //参数一：异常类型，注意必须是异常类型的全类名   参数二：师徒名称
        mappings.put("java.lang.ArithmeticException","error4");
        mappings.put("java.lang.NullPointerException","error4");
        smer.setExceptionMappings(mappings);
        return smer;
    }
    
}
