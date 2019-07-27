package com.qiao.mask.getway.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author huangqf
 * @date: 2019/7/27 14:28
 * @description:
 * @email mr.huangqf@gmail.com
 */
@Configuration
@Order(0)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /**
     * 权限配置
     * - 禁用csrf
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
