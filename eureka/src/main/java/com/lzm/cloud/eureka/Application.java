package com.lzm.cloud.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}