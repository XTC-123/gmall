package com.xtc.gmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author xtc
 * @create 2020-05-17 18:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class UmsMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  id;
    private String  memberLevelId;
    private String  username;
    private String  password;
    private String  nickname;
    private String  phone;
    private Integer status;
    private Date    createTime;
    private String  icon;
    private Integer gender;
    private Date    birthday;
    private String  city;
    private String  job;
    private String  personalizedSignature;
    private Integer sourceType;
    private Integer integration;
    private Integer growth;
    private Integer luckeyCount;
    private Integer historyIntegration;

}
