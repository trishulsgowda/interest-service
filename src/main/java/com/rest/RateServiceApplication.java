package com.rest;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RateServiceApplication {

	@Autowired
	private RateRepository rateRepository;
	
	public static void main(String[] args) {
	      SpringApplication.run(RateServiceApplication.class, args);
	}
	
	@PostConstruct
	public void setupData() {
		rateRepository.initializeRates(Arrays.asList(
				Rate.builder().id(1).type("PERSONAL").rateValue(10.0).build(),
		        Rate.builder().id(2).type("HOUSING").rateValue(8.0).build()
		));
	}
}
