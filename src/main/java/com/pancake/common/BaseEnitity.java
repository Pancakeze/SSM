package com.pancake.common;

import com.pancake.utils.JsonUtils;

/**
 * Created by zhibingze on 2018/7/9.
 */
public class BaseEnitity {

    @Override
    public String toString() {
        return JsonUtils.ObjToGson(this).toString();
    }
}
