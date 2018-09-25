package com.pancake.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhibingze on 2018/9/18.
 *
 * 关键：@Around 下添加 ProceedingJoinPoint  proceed() 方法，，
 * 如果不添加，只执行 @Around @After @AfterRunning/@AfterThrowing
 *
 * 无异常  执行顺序
 * @Around @Before  method @After @AfterRunning
 *
 * 有异常  执行顺序
 * @Around @Before  method @After @AfterThrowing
 */
@Component
@Aspect
public class SecondAdvice {

    @Pointcut("execution(* com.pancake.service.impl.LinksServiceImpl.*(..))")
    public void pointCut(){    }


    @Before("pointCut()")
    public void before() {
        System.out.println("before method");
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after method");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around method");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @AfterReturning("pointCut()")
    public void afterRunning() {
        System.out.println("afterRunning method!");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing method!");
    }


}
