package org.mykola.eurrekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient ставим, если сервер НЕ ЕВРИКА!
public class EurrekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurrekaclientApplication.class, args);
    }

}
