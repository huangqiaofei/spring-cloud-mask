package com.qiao.mask.user.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 */

@AllArgsConstructor
@Getter
public enum ResultCode {

    // 通用模块
    UNDEFINED(-1, "未定义"),
    SUCCESS(0, "成功"),
    DEBUG(1, "调试模式"),
    PARAM_NULL(-2, "参数不完整"),

    // 系统通用模块
    BACK_DOORS(9008, "环境异常"),
    NET_ERROR(9009, "网络错误");

    private int code;
    private String msg;
}
