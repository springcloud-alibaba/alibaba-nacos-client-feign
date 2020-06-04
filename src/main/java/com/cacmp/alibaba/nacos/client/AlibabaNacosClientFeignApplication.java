package com.cacmp.alibaba.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cb
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AlibabaNacosClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosClientFeignApplication.class, args);
    }

}
