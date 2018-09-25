package com.pancake.mq;

import com.pancake.mq.provider.FirstProvider;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhibingze on 2018/9/25.
 */
@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml","classpath:spring/spring-rabbitmq.xml"})
public class RabbitMQTest {

    @Autowired
    private FirstProvider rabbitMQ;

    @Test
    public void testPushMsg2Mq() throws Exception {
        rabbitMQ.pushMsg2Mq();

    }
}