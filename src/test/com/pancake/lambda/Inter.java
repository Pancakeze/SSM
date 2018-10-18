package com.pancake.lambda;

/**
 * Created by zhibingze on 2018/9/26.
 */

/**
 * 想要使用lambda函数式编程，接口中只能存在一个方法
 */
@FunctionalInterface
public interface Inter {

    /**
     * void test();
     *   Inter inter =() -> {
     *      for (int i=0;i<100;i++) {
     *          System.out.println(i);
     *      }
     *   };
     */


    /**
     * String test(String xiaomei);
     * Inter inter = xiaomei -> xiaomei
     */

    int sum(int a, int b);

    default int sum(int a, int b, int c){
        return a+b+c;
    }
}
