package com.pancake.lambda;

/**
 * Created by zhibingze on 2018/9/26.
 */
public class Lambda1 {

     String part = "part1";
     static String str = "part2";
    public  void test(){
        String book = "zbz";
        Inter inter = (a,b)->{
            System.out.println(book);
            System.out.println(part);
            System.out.println(str);
            return a+b;
        };

        System.out.println(inter.sum(5,6)+inter.sum(1,2,3));

    }

    public static void main(String []args){
        new Lambda1().test();

    }
}
