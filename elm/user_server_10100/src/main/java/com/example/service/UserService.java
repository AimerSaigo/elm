package com.example.service;

import com.example.dao.UserDao;
import com.example.po.CommonResult;
import com.example.po.User;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    UserDao userDao;

    public CommonResult<User> login(User user) {
        User user1 = userDao.getUserByName(user.getUserName());
        if (!user1.getPassword().equals(user.getPassword()) || user1 == null) {
            return new CommonResult<>(500, "用户名或密码错误", null);
        }
        user1.setPassword(null);
        return new CommonResult<>(200, "登录成功", user1);
    }

    public CommonResult<User> register(User user) {
        User user1 = userDao.getUserByName(user.getUserName());
        if (user1 != null) {
            return new CommonResult<>(500, "用户名已存在", null);
        }
        userDao.save(user);
        user.setPassword(null);
        return new CommonResult<>(200, "注册成功", user);
    }
}
