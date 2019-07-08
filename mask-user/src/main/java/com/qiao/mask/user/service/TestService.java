package com.qiao.mask.user.service;

import com.github.pagehelper.PageInfo;
import com.qiao.mask.user.common.BaseResult;
import com.qiao.mask.user.model.entity.UserEntity;
import com.qiao.mask.user.model.dto.UserDto;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 */

public interface TestService {

    /**
     * 测试接口
     *
     * @param text 测试数据
     * @return String
     */
    String test(String text);

    /**
     * 测试接口
     *
     * @param text 测试数据
     */
    void testException(String text);

    /**
     * 测试接口
     *
     * @param text 测试数据
     * @return BaseResult<String>
     */
    BaseResult<String> testBaseResult(String text);

    /**
     * 测试mybatis接口
     *
     * @param id 用户id
     * @return BaseResult<UserEntity>
     */
    BaseResult<UserEntity> testMybatis(String id);

    /**
     * 测试redis接口
     *
     * @param id 用户id
     * @return BaseResult<UserEntity>
     */
    BaseResult<UserEntity> testRedis(String id);

    /**
     * 测试Mybatis分页插件
     *
     * @param pageNum  当前页码
     * @param pageSize 每页长度
     * @return BaseResult<PageInfo                               <                               UserDto>>
     */
    BaseResult<PageInfo<UserDto>> testPageHelper(Integer pageNum, Integer pageSize);

    /**
     * 测试MapStruct
     *
     * @param id 用户id
     * @return BaseResult<UserDto>
     */
    BaseResult<UserDto> testMapStruct(String id);

    /**
     * 新增用户
     *
     * @param name  姓名
     * @param birth 出生日期
     * @return BaseResult<UserEntity>
     */
    BaseResult<UserEntity> addUser(String name, String birth);

    /**
     * 更新用户
     *
     * @param id    id
     * @param name  姓名
     * @param birth 出生日期
     * @return BaseResult<UserEntity>
     */
    BaseResult<UserEntity> updateUser(String id, String name, String birth);

    Boolean testTransaction(String name, String birth);

}
