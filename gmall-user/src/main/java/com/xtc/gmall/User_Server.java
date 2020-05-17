package com.xtc.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author xtc
 * @create 2020-05-17 15:40
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class User_Server {
    public static void main(String[] args) {
        SpringApplication.run(User_Server.class, args);
    }
}