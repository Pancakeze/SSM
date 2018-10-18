package com.pancake.mq.consumer;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.pancake.dao.PersonDAO;
import com.pancake.pojo.Person;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;

import java.util.Map;

/**
 * Created by zhibingze on 2018/9/21.
 */


public class FirstConsumer {

    @Autowired
    private PersonDAO personDAO;

    public void getMessage(Map<String,Object> map) {

        Person person = new Person();
        person.setStuid("110");
        person.setAge(20);
        person.setName("zbz");
        person.setRabbitMessage(JSON.toJSONString(map));
        personDAO.addPerson(person);

        System.out.println("------------消费者接收到的消息------------"+map.toString());
    }
}
