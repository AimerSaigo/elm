package com.example.dao;

import com.example.po.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressDao extends JpaRepository<Address, String> {
    public List<Address> getAddressByUserId(int uid);
    public Address deleteAdderss(int daId);
}
