package com.wybosoft.microservices.limits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wybosoft.microservices.limits.Configuration;
import com.wybosoft.microservices.limits.model.LimitConfiguration;

@RestController
@RequestMapping(value="/limits/1.0.0")


public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping(value="/limits")
	
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  
	
@GetMapping(value="/limit-check")
	
	public LimitConfiguration retriveLimitsFromConfigurations1()  
	{  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  
} //end class

