package com.qiao.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiao.user.common.BaseResult;
import com.qiao.user.common.BaseResultFactory;
import com.qiao.user.common.constant.ResultCode;
import com.qiao.user.common.exception.BusinessException;
import com.qiao.user.converter.User2UserDtoMapper;
import com.qiao.user.dao.UserDao;
import com.qiao.user.mapper.UserMapper;
import com.qiao.user.model.dto.UserDto;
import com.qiao.user.model.entity.UserEntity;
import com.qiao.user.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 */

@Slf4j
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;

    @Override
    public String test(String text) {
        return text;
    }

    @Override
    public void testException(String text) throws BusinessException {
        throw new BusinessException(ResultCode.UNDEFINED);
    }

    @Override
    public BaseResult<String> testBaseResult(String text) {
        log.info("日志测试：{}", text);
        return new BaseResult<>(text);
    }

    @Override
    public BaseResult<UserEntity> testMybatis(String id) {
        return BaseResultFactory.createSuccessResult(userMapper.findUserById(id));
    }

    @Override
    public BaseResult<UserEntity> testRedis(String id) {
        return BaseResultFactory.createSuccessResult(userDao.findUser(id));
    }

    @Override
    public BaseResult<PageInfo<UserDto>> testPageHelper(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserEntity> users = userMapper.findAll();
        List<UserDto> userDto = User2UserDtoMapper.INSTANCE.users2UserDtos(users);
        PageInfo<UserDto> page = new PageInfo<>(userDto);
        return BaseResultFactory.createSuccessResult(page);
    }

    @Override
    public BaseResult<UserDto> testMapStruct(String id) {
        UserEntity user = userMapper.findUserById(id);
        UserDto dto = User2UserDtoMapper.INSTANCE.user2UserDto(user);
        return BaseResultFactory.createSuccessResult(dto);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseResult<UserEntity> addUser(String name, String birth) {
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setBirth(birth);
        return BaseResultFactory.createSuccessResult(userDao.insertUser(user));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public BaseResult updateUser(String id, String name, String birth) {
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setName(name);
        user.setBirth(birth);
        return BaseResultFactory.createSuccessResult(userDao.updateUser(user));
    }
}
