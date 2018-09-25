package com.pancake.mq.consumer;

import org.springframework.amqp.core.Message;

import java.util.Map;

/**
 * Created by zhibingze on 2018/9/21.
 */


public class FirstConsumer {

    public void getMessage(Map<String,Object> map) {
        System.out.println("------------消费者接收到的消息------------"+map.toString());
    }
}
