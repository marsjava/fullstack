package com.nglabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class O2SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(O2SpringCloudConfigServerApplication.class, args);
	}

}
