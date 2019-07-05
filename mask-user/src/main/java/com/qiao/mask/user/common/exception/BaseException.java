package com.qiao.mask.user.common.exception;

import com.qiao.mask.user.common.BaseResult;
import lombok.AllArgsConstructor;
import lombok.Data;
/**
 *
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 * 基本异常类
 */
@Data
@AllArgsConstructor
public abstract class BaseException extends RuntimeException {

    private int code;
    private String msg;
    private BaseResult baseResult;

    BaseException() {
        super();
    }

    BaseException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.baseResult = new BaseResult(code, msg);
    }
}
