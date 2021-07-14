package com.wybosoft.microservices.limits.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wybosoft.microservices.limits.model.LimitConfiguration;

@RestController
//@RequestMapping(value="/limits")

public class LimitsConfigurationController {
	@GetMapping(value="/limits")
	
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(1000, 1);  
	}  
} //end class

