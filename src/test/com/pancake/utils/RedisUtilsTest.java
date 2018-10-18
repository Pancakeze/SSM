package com.pancake.utils;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by zhibingze on 2018/9/30.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-redis.xml","classpath:spring/spring-mybatis.xml"})
public class RedisUtilsTest {

    @Autowired
    public RedisUtils redisUtils;

    @Test
    public void testGet() throws Exception {
        System.out.println(redisUtils.get("111"));
    }

    @Test
    public void testSet() throws Exception {
        Set<String> set = new HashSet();
        set.add("234");
        set.add("345");
        set.add("456");
        redisUtils.set("111", JSON.toJSONString(set));
    }

    @Test
    public void testSet1() throws Exception {

    }
}