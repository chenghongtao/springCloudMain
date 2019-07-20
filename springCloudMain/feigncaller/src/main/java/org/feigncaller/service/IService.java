package org.feigncaller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "EurekaClient")
public interface IService {

	@GetMapping("/test/info")
	public String feignCall();
}
