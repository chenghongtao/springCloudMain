package org.caller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate template;

	public String testRibbon() {
		return template.getForObject("http://eurekaClient/test/info", String.class);
	}
}
