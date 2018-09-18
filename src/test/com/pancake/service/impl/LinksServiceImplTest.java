package com.pancake.service.impl;

import com.pancake.service.LinksService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhibingze on 2018/9/14.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml"})
public class LinksServiceImplTest {

    @Autowired
    private LinksService linksService;

    @Test
    public void testAppoint() throws Exception {
        linksService.appoint();
    }

    @Test
    public void testPointCut() throws Exception {
        linksService.pointCut();
    }
}