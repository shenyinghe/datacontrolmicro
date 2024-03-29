package com.pactera.data.governance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pactera.data.governance.service.FeignDataqualityClientService;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	FeignDataqualityClientService service;
	
	@ResponseBody
	@RequestMapping(value = "/testsyh101")
	public String test(@RequestParam(value = "uname") String uname) {
		return service.testsyh102(uname);
	}
	
	
	
}
