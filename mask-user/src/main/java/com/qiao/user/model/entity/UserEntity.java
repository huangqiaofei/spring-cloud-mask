package com.qiao.user.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String birth;
}
