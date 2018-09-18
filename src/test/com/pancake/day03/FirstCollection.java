package com.pancake.day03;

import java.util.*;

/**
 * Created by zhibingze on 2018/8/10.
 *
 *  集合、字符串以及数组的长度
 * 1。集合长度用size（）
 * 2。字符串长度用length()
 * 3。数组长度用length
 *
 */
public class FirstCollection {

    public static void main(String []args){

        int[] a = {1, 2, 3, 4};
        System.out.println(a.length);

        String b = "1223";
        System.out.println(b.length());

        // 无序，无重复
        Set set = new HashSet();
        set.add('a');
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add('b');
        set.add(7);
        set.add(8);
        set.add(8);
        set.add(null);
       /* Set set2 = new TreeSet();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(null);*/
//        set.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.hashCode()+"      ");
            System.out.println(it.next()+"    ");
        }

        System.out.println(set.size());

        // 有序，有重复
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(null);

//        list.remove(1);

        System.out.println(list.size());

        Map map = new HashMap();
        System.out.println(map.size());

    }
}
