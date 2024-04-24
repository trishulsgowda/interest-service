package com.rest;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RateRepository{
	
	HashMap<String, Rate> rateMap;

	public void initializeRates(List<Rate> rates){
		
		rateMap = new HashMap<>();
		
		for(Rate r : rates){
			rateMap.put(r.getType(), r);
		}
	}
	
	public Rate findByType(String type) throws Exception {
		
		return rateMap.get(type);
	}
	
}
