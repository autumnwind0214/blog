package com.autumn.blog.domain.bean;

import com.baomidou.mybatisplus.annotation.*;

import lombok.Data;

/**
 * 
 * @TableName account
 */
@TableName(value ="account")
@Data
public class Account extends BaseBean {
    /**
     * 
     */
    @TableField(value = "username")
    private String username;

    /**
     * 
     */
    @TableField(value = "password")
    private String password;

    /**
     * 
     */
    @TableField(value = "salt")
    private String salt;

    /**
     * 
     */
    @TableField(value = "wechat_open_id")
    private String wechatOpenId;

    /**
     * 
     */
    @TableField(value = "qq_open_id")
    private String qqOpenId;

    /**
     * 
     */
    @TableField(value = "token")
    private String token;

    /**
     * 
     */
    @TableField(value = "phone")
    private Integer phone;
}