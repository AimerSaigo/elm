package com.example;

import com.example.po.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "food-service", fallbackFactory = FoodClientFallbackFactory.class, configuration = DefaultFeignConfiguration.class)
public interface FoodClient {
    @GetMapping("/food/getFood/{bid}")
    public CommonResult getFood(@PathVariable("bid") int bid);

}
