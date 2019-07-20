package org.feigncaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignCallerApplication {
	public static void main(String[] args) {
		SpringApplication.run(FeignCallerApplication.class, args);
	}
}
