package com.sudm.spring.config.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SpringRestController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringRestController.class);

	@Value("${test.prop.value}")
	private String strVal;

	@GetMapping("/strVal")
	public ResponseEntity<String> greeting() {
		
		LOGGER.info("This is info log - CLIENT1");
		LOGGER.trace("This is trace log - CLIENT1");
		LOGGER.debug("This is debug log - CLIENT1");
		LOGGER.error("This is error log - CLIENT1", new Exception("Test Error"));
		
		
		return new ResponseEntity<String>(strVal, HttpStatus.OK);
	}

}
