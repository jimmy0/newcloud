package com.lzm.cloud.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lzm.cloud.common.model.Store;

@FeignClient("eureka-client")
public interface StoreClient {
	@RequestMapping(value = "/stores", method = RequestMethod.GET)
	public List<Store> getStores();

	@RequestMapping(value = "/stores", method = RequestMethod.POST, consumes = "application/json")
	public Store update(Store store);

}