package com.nglabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class O4CurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(O4CurrencyConversionApplication.class, args);
	}

}
