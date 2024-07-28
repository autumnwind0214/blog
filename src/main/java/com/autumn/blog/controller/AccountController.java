package com.autumn.blog.controller;

import com.autumn.blog.domain.form.LoginForm;
import com.autumn.blog.service.AccountService;
import com.autumn.blog.utils.ReturnData;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author autumn
 * @description
 * @date 2024年07月28日
 * @version: 1.0
 */
@RestController("/account")
public class AccountController {

    @Resource
    private AccountService accountService;


    @PostMapping("/login")
    public ReturnData login(@RequestBody LoginForm form) {

        return ReturnData.success();
    }
}
