package com.nglabs.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nglabs.model.CurrencyExchange;
import com.nglabs.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getExchangeValue(@PathVariable String from, @PathVariable String to) {
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
//		CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(55));
		if(currencyExchange==null) {
			throw new RuntimeException("Unable to find data for "+from+ " to "+to);
		}
		currencyExchange.setEnvironment(environment.getProperty("local.server.port"));		
		return currencyExchange;
	}
}
