package com.qiao.mask.user.common.exception;

import com.qiao.mask.user.common.BaseResult;
import com.qiao.mask.user.utils.LogUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 * <p>
 * 全局异常捕获
 */

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public BaseResult handleBusinessException(BusinessException be) {
        LogUtils.error(be);
        be.printStackTrace();
        return be.getBaseResult();
    }
}
