package me.helllp.demo.springCloudHystrixFeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="EUREKACLIENT", fallback = HystrixFeignServiceFallback.class)
public interface HystrixFeignService {
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiUseFeign(@RequestParam(value = "name") String name);
}
