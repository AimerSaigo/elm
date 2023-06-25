package com.example.dao;

import com.example.po.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends JpaRepository {
    public List<Cart> getCartByUserIdAndBusinessId(int uid, int bid);
    public Cart getCartByUserIdAndBusinessIdAndFoodId(int uid, int bid, int fid);
    public Cart deleteCartByCartId(int cid);
}
