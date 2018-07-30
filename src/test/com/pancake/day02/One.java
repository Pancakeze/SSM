package com.pancake.day02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhibingze on 2018/7/29.
 */
public class One {

    public static void main(String []args){
        try {
            Class clazz = Class.forName("com.pancake.day02.Two");

            Constructor  constructor = clazz.getDeclaredConstructor((Class []) null);
            Two two = (Two)constructor.newInstance();

           /* Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());
            }*/
            // 获取成员变量
            Field[] fields =   clazz.getDeclaredFields();
            for (Field field:fields) {
                if (field.getName().equals("name")) {
                    field.setAccessible(true);

                    field.set(two,"bingze");
                }


                System.out.println(field.getName());
            }


//            System.out.println(two.say());

            Method say = clazz.getMethod("say", null);
            System.out.println(say.invoke(two));

            Method setName = clazz.getMethod("setName", String.class);
            setName.invoke(two, "只炳泽");
            System.out.println(say.invoke(two));





        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
