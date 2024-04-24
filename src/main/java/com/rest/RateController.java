package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RateController {

	@Autowired
    private RateService rateService;
	
	@GetMapping(path = "/rates/{type}")
    public ResponseEntity<Rate> getRateByType(@PathVariable("type") String type) throws Exception {
        return ResponseEntity.ok().body(rateService.getRateByType(type));
    }

}
