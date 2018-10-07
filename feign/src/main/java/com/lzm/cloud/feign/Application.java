package com.lzm.cloud.feign;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lzm.cloud.common.common.Valid;
import com.lzm.cloud.common.model.Store;
import com.lzm.cloud.feign.client.StoreClient;

@SpringBootApplication
@EnableFeignClients
@RestController
public class Application {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public StoreClient storeClient;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public Object sayHi() {
		List<Store> ls = storeClient.getStores();
		for (Store o : ls) {
			logger.info(">>> " + o);
		}
		
		Store o1 = ls.get(0);
		o1.setAmounts(o1.getAmounts() + 1);
		storeClient.update(o1);
		
		ls = storeClient.getStores();
		for (Store o : ls) {
			logger.info(">>> " + o);
		}
		
		return Valid.SUCCESS;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}