package com.spring.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 编写启动类
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeServer {
	public static void main(String[] args) {
		
		SpringApplication.run(EurakeServer.class,args);
		
	}

}
