package com.my.springcloud.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudConfigDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigDeptApplication.class, args);
    }

}
