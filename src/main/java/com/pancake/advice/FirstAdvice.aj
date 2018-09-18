package com.pancake.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhibingze on 2018/9/17.
 */

//@Component
//@Aspect
public class FirstAdvice {


    @Pointcut("execution(* com.pancake.service.impl.LinksServiceImpl.pointCut())")
    public void pointCut(){    }


    @Before("pointCut()")
    public void before() {

        System.out.println();
        System.out.println("before method");
    }

    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println();
        System.out.println("after method");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println();
        System.out.println("around method");
    }
}
