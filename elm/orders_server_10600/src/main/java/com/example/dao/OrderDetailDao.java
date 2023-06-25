package com.example.dao;

import com.example.po.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDao extends JpaRepository<OrderDetail, String > {
    public List<OrderDetail> getOrderDetailByOrderId(int oid);

}
