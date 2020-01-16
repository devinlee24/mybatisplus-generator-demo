package com.devinlee.mybatisplusgeneratordemo.service.impl;

import com.devinlee.mybatisplusgeneratordemo.entity.User;
import com.devinlee.mybatisplusgeneratordemo.mapper.UserMapper;
import com.devinlee.mybatisplusgeneratordemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author devinlee
 * @since 2020-01-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
