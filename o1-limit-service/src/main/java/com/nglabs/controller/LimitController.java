package com.nglabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nglabs.model.Limits;

@RestController
public class LimitController {
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(1, 100);
	}
}
