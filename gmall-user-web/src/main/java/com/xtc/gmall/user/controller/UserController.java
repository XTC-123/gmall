package com.xtc.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xtc.gmall.bean.UmsMember;
import com.xtc.gmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xtc
 * @create 2020-05-18 20:38
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/user/web/list")
    public List<UmsMember> list(){
        return userService.list();
    }


}
