package com.pactera.data.governance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class); 
	
	@ResponseBody
	@RequestMapping(value = "/testsyh102")
	public String test(@RequestParam(value = "uname") String uname) {
		logger.info("***********Start Logging to rabbitMQ************");        
	    logger.info("Publish Welcome Message to RabbitMQ"); 
		return "iiik2>>>>>>"+uname;
	}
	
	
	
}
