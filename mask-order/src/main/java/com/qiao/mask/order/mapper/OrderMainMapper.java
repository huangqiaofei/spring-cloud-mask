package com.qiao.mask.order.mapper;

import com.qiao.mask.order.domain.entity.OrderMainDO;

/**
 * @author huangqf
 * @date: 2019/7/5 17:16
 * mail: 244154988@qq.com
 */
public interface OrderMainMapper {

    int deleteByPrimaryKey(Long id);

    int insert(OrderMainDO record);

    int insertSelective(OrderMainDO record);

    OrderMainDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderMainDO record);

    int updateByPrimaryKey(OrderMainDO record);
}