package com.lzm.cloud.config_client;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Value("${profile}")
    private String profile;
	
	@Value("${hello.world}")
    private String helloWorld;
	
	@Value("${spring.datasource.password}")
    private String password;
	
    @PostConstruct
    private void post() {
        logger.info(">>> profile:" + profile);
        logger.info(">>> password:" + password);
    }
    
    
    @RequestMapping("/")
    public String home() {
        return "Hello World: " + helloWorld;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}