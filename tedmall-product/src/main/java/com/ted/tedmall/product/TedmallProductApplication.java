package com.ted.tedmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ted.tedmall.product.dao")
@SpringBootApplication
public class TedmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TedmallProductApplication.class, args);
    }

}
