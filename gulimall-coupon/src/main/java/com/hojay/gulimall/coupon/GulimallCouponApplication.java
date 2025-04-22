package com.hojay.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.Externalizable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hojay.gulimall.coupon.dao")
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}