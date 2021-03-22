package com.nglabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nglabs.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	public CurrencyExchange findByFromAndTo(String from, String to);
}
