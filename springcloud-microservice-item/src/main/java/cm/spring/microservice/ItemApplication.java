package cm.spring.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient //声明这是eureka的一个客户端
@SpringBootApplication
public class ItemApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ItemApplication.class, args);
	}

}
