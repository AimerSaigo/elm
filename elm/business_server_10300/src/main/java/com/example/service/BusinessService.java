package com.example.service;

import com.example.dao.BusinessDao;
import com.example.po.Business;
import com.example.po.CommonResult;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {
    @Resource
    BusinessDao businessDao;

    public CommonResult<Business> getBusinessById(int bid) {
        Business business = businessDao.getBusinessByBusinessId(bid);
        if (business == null) {
            return new CommonResult<Business>(500, "请求失败", null);
        }
        return new CommonResult<Business>(200, "请求成功", business);
    }

    public CommonResult<List<Business>> getBusinessList() {
        List<Business> businessList = businessDao.findAll();
        if (businessList == null){
            return new CommonResult<List<Business>>(500, "请求失败", null);
        }
        return new CommonResult<List<Business>>(200, "请求成功", businessList);
    }
}
