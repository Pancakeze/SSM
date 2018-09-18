package com.pancake.mq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by zhibingze on 2018/8/9.
 */
public class RabbitMQ {

    @Resource(name="rabbitmqTemplate")
    private RabbitTemplate rabbitTemplate;

    @Value("${exchange}")
    private String exchange;

    @Value("${routeKey}")
    private String routeKey;

    public void pushMsg2Mq(String className, String methodName, Map<String,Object> param ) {
        RabbitMessage msg = new RabbitMessage(exchange,routeKey,className, methodName, param);

        rabbitTemplate.convertAndSend(exchange, routeKey, msg);
    }

}
