package org.feigncaller.controller;

import org.feigncaller.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignCallController {

	@Autowired
	private IService service;
    
	@GetMapping("/call")
	public String feignCall() {
		return service.feignCall();
	}
}
