package com.qiao.mask.common.core.annotation;

import java.lang.annotation.*;

/**
 * @author huangqf
 * @description:配合 SqlLogInterceptor 对指定方法 禁止打印SQL到控制台
 * @mail: mr.huangqf@gmail.com
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface NotDisplaySql {
}
