package com.pancake.day02;

/**
 * Created by zhibingze on 2018/7/29.
 */
public class Two {
    private String name;

    private Integer age;

    public Two() {}
    public Two(String name,Integer age) {
        this.age=age;
        this.name = name;
    }

    public String say() {
       return this.name+":hello  world!";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
