package com.example.dao;

import com.example.po.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessDao extends JpaRepository<Business, String> {
    public Business getBusinessByBusinessId(int bid);
}
