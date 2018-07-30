package com.pancake;

import com.pancake.service.EhcacheService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhibingze on 2018/7/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})

public class TestOne {

    private final static Logger LOGGER = Logger.getLogger(TestOne.class);

    @Autowired
    private EhcacheService echacheService;

    @Test
    public void echacheTest() throws InterruptedException{
        System.out.println("第一次调用结果为"+echacheService.getTimes("param"));
        Thread.sleep(3000);
        System.out.println("第二次调用结果为"+echacheService.getTimes("param"));
        Thread.sleep(10000);
        System.out.println("第三次调用结果为"+echacheService.getTimes("param"));
    }
}
