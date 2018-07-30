package com.pancake.utils;

import com.google.gson.Gson;

/**
 * Created by zhibingze on 2018/7/9.
 */
public class JsonUtils {

    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    public static String ObjToGson(Object object) {

        return gson.toJson(object);
    }

    public static <T> T gsonToObj(String json, Class<T> clazz) {

        return (T) gson.fromJson(json,clazz);
    }
}
