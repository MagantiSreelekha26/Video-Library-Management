package com.example.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="com.example.customerservice",url="localhost:8081")
public interface CustomerFeignClient {
	@GetMapping("mcustomerservice/port")
	public String getPort();

}
