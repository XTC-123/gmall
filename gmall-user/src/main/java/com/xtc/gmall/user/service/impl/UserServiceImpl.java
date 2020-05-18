package com.xtc.gmall.user.service.impl;

import com.xtc.gmall.bean.UmsMember;
import com.xtc.gmall.service.UserService;
import com.xtc.gmall.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xtc
 * @create 2020-05-18 11:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;



    public List<UmsMember> list() {
//        List<UmsMember> umsMembers = dao.selAllUser();
        List<UmsMember> umsMembers = dao.selectAll();
        return umsMembers;

    }
}
