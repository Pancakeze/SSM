package com.pancake.service.impl;

import com.pancake.service.LinksService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhibingze on 2018/9/14.
 */
@Slf4j
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

    @Test
    public void test(){
        log.info("哈哈");
        log.error("1234");
        log.debug("32121");

    }
    public static void main(String []args){
        log.info("哈哈");
        log.error("1234");
        log.debug("32121");

    }
}