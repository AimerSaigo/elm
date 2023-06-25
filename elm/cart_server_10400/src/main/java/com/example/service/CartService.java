package com.example.service;

import com.example.dao.CartDao;
import com.example.po.Cart;
import com.example.po.CommonResult;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Resource
    CartDao cartDao;

    public CommonResult<List<Cart>> getCart(int uid, int bid) {
        List<Cart> cartList =cartDao.getCartByUserIdAndBusinessId(uid, bid);
        if (cartList == null) {
            return new CommonResult<List<Cart>>(500, "请求失败", null);
        }
        return new CommonResult<List<Cart>>(200, "请求成功", cartList);
    }

    public CommonResult saveCart(Cart cart) {
        Cart cart1 = cartDao.getCartByUserIdAndBusinessIdAndFoodId(cart.getUserId(), cart.getBusinessId(), cart.getFoodId());
        if (cart1.getQuantity() == 0) {
            cartDao.save(cart);
        } else {
            cart.setFoodId(cart1.getFoodId()+1);
            cartDao.save(cart);
        }
        return new CommonResult(200, "创建成功", cart1);
    }

    public CommonResult deleteCart(int cid) {
        cartDao.deleteCartByCartId(cid);
        return new CommonResult(200, "删除成功", null);
    }
}
