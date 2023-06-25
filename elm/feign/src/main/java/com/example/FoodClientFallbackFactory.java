package com.example;

import lombok.extern.slf4j.Slf4j;
import com.example.FoodClient;
import com.example.po.CommonResult;
import org.springframework.cloud.openfeign.FallbackFactory;

@Slf4j
public class FoodClientFallbackFactory implements FallbackFactory<FoodClient> {

    @Override
    public FoodClient create(Throwable cause) {
        return new FoodClient() {
            @Override
            public CommonResult getFood(int bid) {
                log.error("查询商家食品异常", cause);
                return new CommonResult(403, "查询商家食品异常", null);
            }
        };
    }
}

