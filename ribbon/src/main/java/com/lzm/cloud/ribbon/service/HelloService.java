package com.lzm.cloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForEntity("http://eureka-client/stores?name=" + name, String.class).getBody();
	}
}
