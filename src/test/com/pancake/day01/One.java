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
public class One {

    public static void main(String []args){
        List list = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        list3.add("1");
        list3.add(1);
        list3.add(1l);
        list3.add(4f);

        /**
         * list 的json格式
         * ["1",1,1,4]
             [
                 "1",
                 1,
                 1,
                 4
             ]
         */
        System.out.println(JSONArray.toJSON(list3));

        Person person = new Person();
        person.setAge(10);
        person.setName("zhibingze");

        list2.add(person);
        list2.add(person);
        list2.add(2);
        list2.add(2);
        list.add(list2);
        list.add(list2);
        list.add(list2);

        /**
         * 对象的json格式
         *
         *    {"name":"zhibingze","age":10}
         *    {
                "name":"zhibingze",
                "age":10
              }
         */
        System.out.println(JSONArray.toJSON(person));

        Map map = new HashMap();
        map.put("1", "1");
        map.put("2", "1");
        map.put("3", "1");
        map.put("4", "1");
        /**
         * map的json格式
         * {"3":"1","2":"1","1":"1","4":"1"}
         *      {
                 "1":"1",
                 "2":"1",
                 "3":"1",
                 "4":"1"
                 }
         */
        System.out.println(JSONArray.toJSON(map));

        list.add(map);

        /**
         * 包含list、map、对象的json格式
         * [[{"name":"zhibingze","age":10},{"name":"zhibingze","age":10},2,2],[{"name":"zhibingze","age":10},{"name":"zhibingze","age":10},2,2],[{"name":"zhibingze","age":10},{"name":"zhibingze","age":10},2,2],{"3":"1","2":"1","1":"1","4":"1"}]
         *
         *      最外层是array，第二层是三个array一个obejct
                 [
                     [
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         2,
                         2
                     ],
                     [
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         2,
                         2
                     ],
                     [
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         {
                         "name":"zhibingze",
                         "age":10
                         },
                         2,
                         2
                     ],
                     {
                     "1":"1",
                     "2":"1",
                     "3":"1",
                     "4":"1"
                     }
                 ]
         */
        System.out.println(JSONArray.toJSON(list));


        List<String> list4 = new ArrayList<String>();
    }
}
