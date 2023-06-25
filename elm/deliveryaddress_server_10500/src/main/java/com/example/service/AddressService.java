package com.example.service;

import com.example.dao.AddressDao;
import com.example.po.Address;
import com.example.po.CommonResult;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Resource
    AddressDao addressDao;

    public CommonResult<List<Address>> getAddress(int uid) {
        List<Address> addressList = addressDao.getAddressByUserId(uid);
        if (addressList == null) {
            return new CommonResult<>(500, "请求失败", null);
        }
        return new CommonResult<>(200, "请求成功", addressList);
    }

    public CommonResult<Address> saveAddress(Address address) {
        Address address1 = addressDao.save(address);
        if (address1 == null) {
            return new CommonResult<>(500, "请求失败", null);
        }
        return new CommonResult<>(200, "请求成功", address1);
    }

    public CommonResult<Address> deleteAddress(int daId) {
        addressDao.deleteAdderss(daId);
        return new CommonResult<>(200, "请求成功", null);
    }
}
