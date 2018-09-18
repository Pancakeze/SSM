package com.pancake.day04;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhibingze on 2018/8/19.
 */
public class StringTest {

    public static void main(String []args){
        String abc = "abc";
        System.out.println("".toString());
        System.out.println(true || false);

        List<String> arr = new ArrayList<>();
        arr.add("124");
        arr.add("edeqw");
        System.out.println( JSON.toJSONString(arr));
        System.out.println(lengthOfLongestSubstring(abc));

    }


    public static  int lengthOfLongestSubstring(String s) {

        s=s.trim();
        int len = s.length();
        int max = 0;

        for(int i=0;i<len;i++) {
            for(int j=1+i;j <= len;j++) {
                if (allUnique(s, i, j)) {
                    max = Math.max(max, j - i);
                }

            }

        }

        return max;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch))
                return false;
            set.add(ch);
        }
        return true;
    }


}
