package com.qiao.mask.common.core.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author huangqf
 * @description:
 * @mail: mr.huangqf@gmail.com
 */
@Aspect
@Component
public class NotDisplaySqlAspect {
    /**
     * The constant DISPLAY_SQL.
     */
    public static final String DISPLAY_SQL = "DISPLAY_SQL";

    @Pointcut("@annotation(com.qiao.mask.common.core.annotation.NotDisplaySql)")
    private void myPointCut() {
    }

    /**
     * Before.
     */
    @Before(value = "myPointCut()")
    public void before() {

    }

    /**
     * After.
     */
    @After(value = "myPointCut()")
    public void after() {
    }
}
