package com.qiao.mask.user.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author：于起宇 <p>
 * ================================
 * Created with IDEA.
 * Date：2018/11/3
 * Time：10:33 AM
 * 个人博客：http://blog.yuqiyu.com
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * 码云：https://gitee.com/hengboy
 * GitHub：https://github.com/hengyuboy
 * ================================
 * </p>
 */
@RestController
public class UserController {

    @PreAuthorize("#oauth2.hasScope('api')")
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld(Principal principal) {
        return principal == null ? "Hello anonymous" : "Hello " + principal.getName();
    }

    /**
     *
     * @param principal
     * @return
     */
    @PreAuthorize("#oauth2.hasScope('api') and hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "secret", method = RequestMethod.GET)
    public String helloSecret(Principal principal) {
        return principal == null ? "Hello anonymous" : "S3CR3T  - Hello " + principal.getName();
    }
}
