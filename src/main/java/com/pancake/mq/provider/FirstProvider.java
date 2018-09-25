package com.pancake.mq.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhibingze on 2018/8/9.
 */


@Component
public class FirstProvider {

    @Resource(name="amqpTemplate")
    private AmqpTemplate amqpTemplate;

    @Value("${rmq.exchange}")
    private String exchange;

//    @Value("${rmq.routeKey}")
    private String routeKey="pancake.key.zbz.bingze";

    public void pushMsg2Mq() {
        Map<String, Object> map = new HashMap();
        map.put("name", "zbz");
        amqpTemplate.convertAndSend(exchange, routeKey, map);
        System.out.println("----------------服务器端发送完毕---------------------");
    }

}
