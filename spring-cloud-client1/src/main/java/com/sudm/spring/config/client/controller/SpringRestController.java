package com.sudm.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SpringRestController {

	@Value("${vldn.count.value}")
	private String strVal;

	@GetMapping("/strVal")
	public ResponseEntity<String> greeting() {
		return new ResponseEntity<String>(strVal, HttpStatus.OK);
	}

}
