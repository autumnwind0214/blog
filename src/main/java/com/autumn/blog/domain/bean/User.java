package com.autumn.blog.domain.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @TableName user
 */
@TableName(value = "user")
@Data
public class User extends BaseBean {


    /**
     *
     */
    @TableField(value = "name")
    private String name;

    /**
     *
     */
    @TableField(value = "gender")
    private Boolean gender;

    /**
     *
     */
    @TableField(value = "email")
    private String email;

    /**
     *
     */
    @TableField(value = "id_card_code")
    private String idCardCode;

    /**
     *
     */
    @TableField(value = "birthday")
    private LocalDateTime birthday;

    /**
     *
     */
    @TableField(value = "account_id")
    private Long accountId;
}