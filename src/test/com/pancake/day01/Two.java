package com.pancake.day01;

import com.alibaba.fastjson.JSONArray;
import com.pancake.pojo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhibingze on 2018/7/27.
 */
public class Two {
    public static void main(String []args){
        List<String> list = new ArrayList<String>();

        list.add("zhi");
        list.add("bing");
        list.add("ze");

        System.out.print("未经json处理:");
        System.out.println(list);

        String json = JSONArray.toJSONString(list);

        System.out.print("经过json处理:");
        System.out.println(json);

        System.out.println("------------------------------------------------------");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1", "zhi");
        map.put("2", "bing");
        map.put("3", "ze");
        map.put("4", 1);
        map.put("5", 4l);

        System.out.print("未经json处理:");
        System.out.println(map);

        String mapJson = JSONArray.toJSONString(map);

        System.out.print("经过json处理:");
        System.out.println(mapJson);

        System.out.println("------------------------------------------------------");

        Person person = new Person();
        person.setAge(20);
        person.setName("zhibingze");

        System.out.print("未经json处理:");
        System.out.println(person);

        String objJson = JSONArray.toJSONString(person);

        System.out.print("经过json处理:");
        System.out.println(objJson);
    }
}
