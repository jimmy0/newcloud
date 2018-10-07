package com.lzm.cloud.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableZuulProxy
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}