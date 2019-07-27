package com.qiao.mask.auth.jwt;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
/**
 * @author huangqf
 * @date: 2019/7/27 14:28
 * @description:SpringSecurity安全认证配置类
 * @email mr.huangqf@gmail.com
 */
@Order(SecurityProperties.BASIC_AUTH_ORDER - 6)
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    /**
     * 配置基本权限
     * 拦截所有请求路径都被权限进行拦截
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated();
    }

    /**
     * 认证管理配置
     * 未加密的密码为：123456
     *
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("").password("").roles("USER")
                .and()
                .withUser("").password("、").roles("ADMIN");
    }

    /**
     * 授权认证管理者实例化
     *
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 密码加密方式
     * 采用BCryptPasswordEncoder加密方式
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
