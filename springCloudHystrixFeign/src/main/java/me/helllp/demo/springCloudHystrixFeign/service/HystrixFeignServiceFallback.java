package me.helllp.demo.springCloudHystrixFeign.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixFeignServiceFallback implements HystrixFeignService{

	@Override
	public String sayHiUseFeign(String name) {
		return "feign调用错误！";
	}

}
