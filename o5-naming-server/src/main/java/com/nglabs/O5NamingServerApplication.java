package com.nglabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class O5NamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(O5NamingServerApplication.class, args);
	}

}
