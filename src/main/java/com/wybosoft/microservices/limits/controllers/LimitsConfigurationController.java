package com.wybosoft.microservices.limits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wybosoft.microservices.limits.Configuration;
import com.wybosoft.microservices.limits.model.LimitConfiguration;

@RestController
//@RequestMapping(value="/limits")


public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping(value="/limits")
	
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  
} //end class

