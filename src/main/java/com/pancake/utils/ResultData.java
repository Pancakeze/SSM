package com.pancake.utils;

import com.pancake.enums.ResultEnum;
import com.pancake.pojo.Person;

import java.util.List;

/**
 * Created by zhibingze on 2018/7/9.
 */
public class ResultData<T> {



    private int code= ResultEnum.RESULT_SUCCESS.getCode();

    private String msg=ResultEnum.RESULT_SUCCESS.getMsg();

    private T data;

    public ResultData(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return JsonUtils.ObjToGson(this);
    }
}
