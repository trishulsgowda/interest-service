package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

	@Autowired
    private RateRepository repository;
	
	public Rate getRateByType(String type) throws Exception {
        return repository.findByType(type);
    }
}
