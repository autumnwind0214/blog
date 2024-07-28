package com.autumn.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.autumn.blog.domain.bean.Account;
import com.autumn.blog.service.AccountService;
import com.autumn.blog.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
 * @author autumn
 * @description 针对表【account】的数据库操作Service实现
 * @createDate 2024-07-28 18:57:27
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
        implements AccountService {

}




