package com.pancake.pojo;

/**
 * Created by zhibingze on 2018/7/9.
 */
public class Person {

    private String stuid;

    private String name;

    private int age;

    private String rabbitMessage;

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRabbitMessage() {
        return rabbitMessage;
    }

    public void setRabbitMessage(String rabbitMessage) {
        this.rabbitMessage = rabbitMessage;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
