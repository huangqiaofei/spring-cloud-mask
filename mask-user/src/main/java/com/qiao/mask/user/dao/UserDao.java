package com.qiao.mask.user.dao;


import com.qiao.mask.user.model.entity.UserEntity;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 */

public interface UserDao {

    /**
     * 插入用户
     *
     * @param user 用户实体
     * @return UserEntity
     */
    UserEntity insertUser(UserEntity user);

    /**
     * 更新
     *
     * @param user 用户实体
     * @return UserEntity
     */
    UserEntity updateUser(UserEntity user);

    /**
     * 查询用户
     *
     * @param id 用户编号
     * @return UserEntity
     */
    UserEntity findUser(String id);
}
