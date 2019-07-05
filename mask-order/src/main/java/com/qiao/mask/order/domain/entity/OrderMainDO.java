package com.qiao.mask.order.domain.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author huangqf
 * @date: 2019/7/5 17:15
 * mail: mr.huangqf@gmail.com
 */
@Data
public class OrderMainDO {

    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 订单金额
     */
    private BigDecimal payment;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商户id
     */
    private Long shippingId;

    /**
     * 支付类型
     */
    private Integer paymentType;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 支付时间
     */
    private Date paymentTime;

}