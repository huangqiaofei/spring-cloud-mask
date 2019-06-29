package com.qiao.user.mapper;

import com.qiao.user.model.entity.UserEntity;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 */

@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     *
     * @return List<User>
     */
    List<UserEntity> findAll();

    /**
     * 根据用户id查询
     *
     * @param id 用户id
     * @return User
     */
    UserEntity findUserById(@Param("id") String id);

    /**
     * 插入用户，返回用户id
     * 需要注意的是在mapper接口中不能使用@Param("")绑定传入实体参数，这样主键会绑定到新建的实体中。
     * 如@Param("user") UserEntity user主键会绑定到新建的实体，即getId() = null。
     *
     * @param user 用户实体
     * @return Long
     */
    Long insertUser(UserEntity user);

    /**
     * 更新用户
     *
     * @param user 用户实体
     * @return Long
     */
    Long updateUser(UserEntity user);
}
