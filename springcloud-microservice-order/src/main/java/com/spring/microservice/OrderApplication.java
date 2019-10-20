package com.spring.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient //声明这是一个eureka的客户端
@SpringBootApplication
public class OrderApplication {
	// 将RestTemplate交给spring管理
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
		
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(OrderApplication.class, args);
		
	}

}
