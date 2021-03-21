package com.nglabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nglabs.config.LimitConfiguration;
import com.nglabs.model.Limits;

@RestController
public class LimitController {
	
	@Autowired
	private LimitConfiguration config;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
		//return new Limits(1, 100);
	}
}
