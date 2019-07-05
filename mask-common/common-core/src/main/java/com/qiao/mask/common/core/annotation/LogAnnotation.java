package com.qiao.mask.common.core.annotation;

import com.qiao.mask.common.core.enums.LogTypeEnum;

import java.lang.annotation.*;

/**
 * @author huangqf
 * @description:操作日志
 * @mail: mr.huangqf@gmail.com
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    /**
     * 日志类型
     *
     * @return the log type enum
     */
    LogTypeEnum logType() default LogTypeEnum.OPERATION_LOG;

    /**
     * 是否保存请求的参数
     *
     * @return the boolean
     */
    boolean isSaveRequestData() default false;

    /**
     * 是否保存响应的结果
     *
     * @return the boolean
     */
    boolean isSaveResponseData() default false;
}
