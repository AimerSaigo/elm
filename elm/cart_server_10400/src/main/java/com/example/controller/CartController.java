package com.example.controller;

import com.example.po.Cart;
import com.example.po.CommonResult;
import com.example.service.CartService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@RefreshScope
public class CartController {
    @Resource
    CartService cartService;

    @GetMapping("/{uid}/{bid}")
    public CommonResult<List<Cart>> getCart(@PathVariable int uid, @PathVariable int bid) {
        return cartService.getCart(uid, bid);
    }

    @PostMapping("/saveCart")
    public CommonResult saveCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @PostMapping("/deleteCart/{cid}")
    public CommonResult deleteCart(@PathVariable int cid) {
        return cartService.deleteCart(cid);
    }
}
