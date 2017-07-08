package me.helllp.demo.eurekaCustomer.service;

import me.helllp.demo.eurekaCustomer.config.FeignConfiguration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="EUREKACLIENT", configuration=FeignConfiguration.class)
public interface FeignService {
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiUseFeign(@RequestParam(value = "name") String name);
}
