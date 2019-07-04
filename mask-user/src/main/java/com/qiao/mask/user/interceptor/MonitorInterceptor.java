/*
package com.qiao.mask.user.interceptor;

import com.qiao.mask.user.utils.LogUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*/
/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 *//*


@Component
public class MonitorInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        httpServletRequest.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, ModelAndView modelAndView) throws Exception {
        LogUtils.info("耗时: " + (System.currentTimeMillis() - (long) httpServletRequest.getAttribute("startTime")) + "ms");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {
        LogUtils.info("耗时: " + (System.currentTimeMillis() - (long) httpServletRequest.getAttribute("startTime")) + "ms");
    }
}
*/
