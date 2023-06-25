package com.example.dao;

import com.example.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    public User getUserByUserId(int userId);
    public User getUserByName(String userName);
    public User getUserByPassword(String userName, String password);
}
