package com.qiao.mask.user.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * email: mr.huangqf@gmail.com
 */

@Data
@NoArgsConstructor
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
}
