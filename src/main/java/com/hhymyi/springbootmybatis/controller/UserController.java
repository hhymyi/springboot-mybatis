package com.hhymyi.springbootmybatis.controller;

import com.hhymyi.springbootmybatis.model.User;
import com.hhymyi.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        return userService.findAllUser(pageNum, pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/testTransaction", produces = {"application/json;charset=UTF-8"})
    public Object testTransaction() {
        return userService.testTransaction("");
    }

}