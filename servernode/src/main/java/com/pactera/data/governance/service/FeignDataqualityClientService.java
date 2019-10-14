package com.pactera.data.governance.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dataqualityservernode")
@Component
public interface FeignDataqualityClientService {
	
	@RequestMapping(path = "/test/testsyh102")
	public String testsyh102(@RequestParam(value = "uname") String uname);
	
}
