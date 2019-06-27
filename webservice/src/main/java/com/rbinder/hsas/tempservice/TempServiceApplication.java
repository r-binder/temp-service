package com.rbinder.hsas.tempservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class TempServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(TempServiceApplication.class, args);
	}

}
