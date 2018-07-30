package com.pancake.interceptoer;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhibingze on 2018/7/20.
 *  第一种实现方式HandlerInterceptor ，，其中preHandle 能进行访问终止
 *  第二种实现方式WebRequestInterceptor,其中preHandle 不能进行访问终止
 *
 *  使用场景
 *      使用原则：处理所有请求共性问题
 *      1。解决乱码问题
 *      2。解决权限登陆问题。
 *
 *  拦截器和过滤器的区别：
 *
 *      拦截器：interceptor依赖于框架容器，基于反射机制，只过滤请求
 *      过滤器：filter依赖于servelt容器，基于回调函数，过滤范围大。
 *
 */

public class FristInterceptor implements HandlerInterceptor {

    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o 被拦截的请求目标对象
     * @return  返回true 继续运行，返回false 终止
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       System.out.println(o.toString());
        return true;
    }

    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView 改变显示的视图，或修改发往视图的方法
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("msg", "我的第一个拦截器!");
        System.out.println("2");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("3");
    }
}
