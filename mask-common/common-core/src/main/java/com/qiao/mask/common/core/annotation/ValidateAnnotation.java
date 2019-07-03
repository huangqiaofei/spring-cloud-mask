package com.qiao.mask.common.core.annotation;

import java.lang.annotation.*;

/**
 * @author huangqf
 * @description:
 * @mail: 244154988@qq.com
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidateAnnotation {
    /**
     * Is validate boolean.
     *
     * @return the boolean
     */
    boolean isValidate() default true;
}