package com.xtc.gmall.user.controller;

import com.xtc.gmall.bean.UmsMember;
import com.xtc.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author xtc
 * @create 2020-05-17 15:54
 */
@RestController
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/get")
    public String get(){
        return "test...";
    }

    @GetMapping("/user/list")
    public List<UmsMember> list(){
        List<UmsMember> umsMembers = service.list();
        return umsMembers;
    }

}
