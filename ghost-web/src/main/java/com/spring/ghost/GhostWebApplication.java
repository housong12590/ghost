package com.spring.ghost;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.spring.ghost.mapper","com.spring.ghost.dao"})
@SpringBootApplication
public class GhostWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhostWebApplication.class, args);
    }

}

