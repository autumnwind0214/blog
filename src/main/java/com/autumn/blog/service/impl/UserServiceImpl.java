package com.autumn.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.autumn.blog.domain.bean.User;
import com.autumn.blog.service.UserService;
import com.autumn.blog.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author autumn
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-07-28 18:57:27
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




