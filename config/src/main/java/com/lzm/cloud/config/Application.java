package com.lzm.cloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}