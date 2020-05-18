package com.xtc.gmall.user.dao;

import com.xtc.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author xtc
 * @create 2020-05-17 15:54
 */
@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper<UmsMember> {

    List<UmsMember> selAllUser();

}
