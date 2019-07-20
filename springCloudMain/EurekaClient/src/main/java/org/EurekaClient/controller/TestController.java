package org.EurekaClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private DiscoveryClient client;
    
	@GetMapping("/info")
	public String test() {
        List<String> services=client.getServices();
        services.stream().forEach(item->System.out.println(item));
		return null;
	}
}
