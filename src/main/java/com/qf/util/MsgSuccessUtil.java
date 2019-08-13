package com.qf.util;

import java.util.List;

/**
 * @auther 费龙衍
 * @date 2019/8/2 11:46
 * 面向对象面向君,不负代码不负卿
 */
public class MsgSuccessUtil {
    private int code=0;
    private String msg="success";
    private Object data;

    public MsgSuccessUtil() {
    }

    public MsgSuccessUtil(Object data) {
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
