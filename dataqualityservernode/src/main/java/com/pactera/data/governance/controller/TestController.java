package com.pactera.data.governance.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	HttpServletRequest request;
	
	@ResponseBody
	@RequestMapping(value = "/testsyh102")
	public String test(@RequestParam(value = "uname") String uname) {
		
		return "iiik2>>>>>>"+uname;
	}
	
	
	
}
