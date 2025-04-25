package com.hojay.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@MapperScan("com.hojay.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        Consumer<String> s = (String string) -> {
            System.out.println(string);
        };
        SpringApplication.run(GulimallProductApplication.class, args);

    }

}
