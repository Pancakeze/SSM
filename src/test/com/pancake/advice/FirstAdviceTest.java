package com.pancake.advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by zhibingze on 2018/9/18.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml"})

public class FirstAdviceTest {

    @Autowired
    private SecondAdvice firstAdvice;

    @Test
    public void testBefore() throws Exception {
//        firstAdvice.before();
        System.out.println();

    }

    @Test
    public void testAfter() throws Exception {

    }

    @Test
    public void testAround() throws Exception {

    }
}