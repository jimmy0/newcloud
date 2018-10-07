package com.lzm.cloud.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableCircuitBreaker
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "getFallback") // 如果当前调用的get()方法出现了错误，则执行fallback
	public Object get(@PathVariable("id") long id) {
		if (id > 0) {
			return "success";
		} else {
			throw new RuntimeException("failure");
		}
	}

	public Object getFallback(@PathVariable("id") long id) { // 此时方法的参数 与get()一致
		return "haha";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}