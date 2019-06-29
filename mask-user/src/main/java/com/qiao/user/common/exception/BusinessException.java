package com.qiao.user.common.exception;

import com.qiao.user.common.BaseResult;
import com.qiao.user.common.constant.Code;
import lombok.NoArgsConstructor;

/**
 * @author huangqf
 * * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 * <p>
 * 业务异常类
 */

@NoArgsConstructor
public final class BusinessException extends BaseException {

    public BusinessException(Code code) {
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
