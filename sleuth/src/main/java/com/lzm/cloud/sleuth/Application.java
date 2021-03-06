package com.lzm.cloud.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return restTemplate.getForEntity("http://ribbon/hi?name=" + name, String.class).getBody();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}