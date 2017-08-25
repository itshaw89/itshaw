package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 */
@Entity
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue
    @Id
    private Integer id;

    // 用户名称
    private String username;

    // 用户密码
    private String password;

    // 用户密码
    private String confirmPassword;

    // 用户的邮箱
    private String email;

    // 用户的主页
    private String home_url;

    // 用户显示的名称
    private String screen_name;

    // 用户注册时的时间戳
    private Date created;

    // 最后活动时间
    private Date activated;

    // 上次登录最后活跃时间
    private Date logged;

    // 用户组
    private String group_name;

    public UserInfo() {
    }

}