package com.hhymyi.springbootmybatis.service;

import com.hhymyi.springbootmybatis.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    String testTransaction(String s);
}