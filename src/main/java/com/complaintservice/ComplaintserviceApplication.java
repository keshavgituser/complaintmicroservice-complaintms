package com.complaintservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author Ragini
 *This annotation contain @Configuration , @EnableAutoConfiguration and @ComponentScan
 *
 *This application runs on port 9091
 */
@SpringBootApplication
@EnableEurekaClient
public class ComplaintserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplaintserviceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {return new RestTemplate();}
}
