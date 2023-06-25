package com.example.controller;

import com.example.po.Address;
import com.example.po.CommonResult;
import com.example.service.AddressService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@RefreshScope
public class AddressController {
    @Resource
    AddressService addressService;

    @GetMapping("/getAddress/{uid}")
    public CommonResult<List<Address>> getAddress(@PathVariable int uid) {
        return addressService.getAddress(uid);
    }

    @PostMapping("/saveAddress")
    public CommonResult<Address> saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @PostMapping("/deleteAddress/{daId}")
    public CommonResult<Address> deleteAddress(@PathVariable int daId) {
        return addressService.deleteAddress(daId);
    }
}
