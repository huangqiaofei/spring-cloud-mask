package com.qiao.mask.user.common;

import com.qiao.mask.user.common.constant.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 * <p>
 * 统一的返回类型
 */

@SuppressWarnings("unchecked")
@Data
@AllArgsConstructor
public final class BaseResult<T> implements Serializable {

    private int code;
    private String message;
    private T data = (T) new Object();

    public BaseResult() {
        this.data = (T) new Object();
    }

    public BaseResult(String msg) {
        this();
        this.code = 200;
        this.message = msg;
    }

    public BaseResult(ResultCode code) {
        this.code = code.getCode();
        this.message = code.getMsg();
    }

    public BaseResult(ResultCode code, T data) {
        this.code = code.getCode();
        this.message = code.getMsg();
        this.data = data;
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResult{" + "code=" + code + ", message='" + message + ", data=" + data + '}';
    }
}
