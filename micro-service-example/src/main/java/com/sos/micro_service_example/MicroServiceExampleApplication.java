package com.sos.micro_service_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroServiceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceExampleApplication.class, args);
	}

}
