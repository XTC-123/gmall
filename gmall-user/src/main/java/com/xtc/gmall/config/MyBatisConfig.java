package com.xtc.gmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xtc
 * @create 2020-05-17 15:42
 */
@Configuration
@MapperScan("com.xtc.gmall.dao")
public class MyBatisConfig {

    @Bean
    ConfigurationCustomizer configurationCustomizer(){
        return configuration -> {
            configuration.setMapUnderscoreToCamelCase(true);
            configuration.setCacheEnabled(true);
        };
    }

}
