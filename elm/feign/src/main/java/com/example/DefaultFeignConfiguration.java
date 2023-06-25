package com.example;

import org.springframework.context.annotation.Bean;

public class DefaultFeignConfiguration {
    @Bean
    public FoodClientFallbackFactory foodClientFallbackFactory() {
        return new FoodClientFallbackFactory();
    }
}
