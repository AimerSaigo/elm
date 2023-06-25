package com.example.dao;

import com.example.po.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order, String> {
    public List<Order> getOrderByUserId(int uid);
    public Order getOrderByOrderId(int oid);
}
