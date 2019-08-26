package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.beans.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(){

        List<UmsMember> userMembers= userService.getAllUser();
        return userMembers;
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public UmsMember getUserById(String id){

        UmsMember userById = userService.getUserById(id);

        return userById;
    }
}
