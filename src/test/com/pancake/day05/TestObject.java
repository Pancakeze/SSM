package com.pancake.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhibingze on 2018/10/12.
 */
public class TestObject {

    public static void main(String[] args) {

        List<Student> list = new ArrayList();
        Student s = new Student("123", 20);
        Student t = new Student("234", 21);
        list.add(s);
        list.add(t);
        list.remove(t);

        /*Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextBoolean() ? 1 : -1);
        }*/
        Student st = new Student();
        addObject(st);
        System.out.println(st.getName());
        int c = add(1, 2);
        System.out.println(c);
    }

    public static int add(int a, int b) {

        return a + b;
    }

    public static void addObject(Student st) {
        st.setAge(20);
        st.setName("202");
    }

}