package com.xtc.gmall.service.impl;

import com.xtc.gmall.dao.UserDao;
import com.xtc.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xtc
 * @create 2020-05-17 15:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;



}
