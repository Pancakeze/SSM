package com.pancake.enums;

/**
 * Created by zhibingze on 2018/7/9.
 */
public enum ResultEnum {
    RESULT_SUCCESS("成功！",200),

    RESULT_FAIL("失败!",400);

    private final String msg;

    private final int code;

     ResultEnum(String msg,int code) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
