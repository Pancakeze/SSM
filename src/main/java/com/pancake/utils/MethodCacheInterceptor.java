package com.pancake.utils;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by zhibingze on 2018/9/30.
 */
public class MethodCacheInterceptor implements MethodInterceptor {


    private RedisUtils redisUtils;

    public void setRedisUtils(RedisUtils redisUtils) {
        this.redisUtils = redisUtils;
    }
    public MethodCacheInterceptor() {

    }
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return null;
    }


}
