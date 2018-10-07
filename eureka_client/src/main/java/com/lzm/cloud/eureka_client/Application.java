package com.lzm.cloud.eureka_client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzm.cloud.common.common.Valid;
import com.lzm.cloud.common.model.Store;

@SpringBootApplication
@RestController
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/stores", method = RequestMethod.GET)
	public Object stores() {
		List<Store> ls = new ArrayList<Store>();
		Store o1 = new Store();
		o1.setId("1");
		o1.setName("店1");
		o1.setAmounts(1);
		o1.setCtime(new Date());
		
		Store o2 = new Store();
		o2.setId("2");
		o2.setName("店2");
		o2.setAmounts(2);
		o2.setCtime(new Date());
		
		ls.add(o1);
		ls.add(o2);
		
		return ls;
	}

	@RequestMapping(value = "/stores", method = RequestMethod.POST, consumes = "application/json")
	public Object updateStore(Store o) {
		
		logger.info("get: " + o);
		
		return Valid.SUCCESS;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}