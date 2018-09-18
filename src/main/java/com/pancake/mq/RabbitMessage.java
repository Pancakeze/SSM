package com.pancake.mq;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by zhibingze on 2018/8/9.
 */
public class RabbitMessage implements Serializable{

    private static final long serialVersionUID = -6487839157908352120L;

    private String exchange;

    private String routeKey;

    private Class<?> [] paramTypes;

    private Object[] params;

    private String methodName;

    private String beanName;

    public RabbitMessage(String exchange, String routeKey, Object... params) {
        this.exchange=exchange;
        this.routeKey=routeKey;
        this.params=params;
    }

    @SuppressWarnings("rawtypes")
    public RabbitMessage(String exchange, String routeKey,String beanName, String methodName, Object... params) {
        this.params = params;
        this.exchange = exchange;
        this.routeKey = routeKey;
        this.methodName=methodName;
        this.beanName=beanName;
        int len = params.length;
        Class[] clazzArray = new Class[len];
        for (int i = 0; i < len; i++)
            clazzArray[i] = params[i].getClass();
        this.paramTypes = clazzArray;
    }

    public byte[] getSerialBytes() {
        byte[] res = new byte[0];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
            res = baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }


}
