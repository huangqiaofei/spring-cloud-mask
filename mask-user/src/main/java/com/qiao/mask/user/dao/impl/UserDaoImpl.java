package com.qiao.mask.user.dao.impl;

import com.qiao.mask.user.dao.UserDao;
import com.qiao.mask.user.mapper.UserMapper;
import com.qiao.mask.user.model.entity.UserEntity;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private UserMapper userMapper;

    @Override
    @CachePut(cacheNames = "user", key = "#user.id")
    public UserEntity insertUser(UserEntity user) {
        userMapper.insertUser(user);
        return user;
    }

    @Override
    @CachePut(cacheNames = "user", key = "#user.id")
    public UserEntity updateUser(UserEntity user) {
        userMapper.updateUser(user);
        return user;
    }

    @Override
    @Cacheable(cacheNames = "findUserById")
    public UserEntity findUser(String id) {
        return userMapper.findUserById(id);
    }
}
