package com.example.contracts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootApplication
@AutoConfigureWireMock
public class SpringContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringContractApplication.class, args);
	}
}
