package com.qiao.mask.user.common.exception;

import com.qiao.mask.user.common.BaseResult;
import com.qiao.mask.user.common.constant.ResultCode;
import lombok.NoArgsConstructor;

/**
 * @author huangqf
 * * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 * <p>
 * 业务异常类
 */

@NoArgsConstructor
public final class BusinessException extends BaseException {

    public BusinessException(ResultCode code) {
        super(code.getCode(), code.getMsg());
    }

    public BusinessException(int codeInt, String errorMsg) {
        super(codeInt, errorMsg);
    }

    public BusinessException(BaseResult baseResult) {
        super();
        this.setBaseResult(baseResult);
    }
}
