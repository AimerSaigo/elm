package com.example.controller;

import com.example.po.CommonResult;
import com.example.po.User;
import com.example.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/login")
    public CommonResult<User> login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping("/register")
    public CommonResult<User> register(@RequestBody User user) {
        return userService.register(user);
    }
}
