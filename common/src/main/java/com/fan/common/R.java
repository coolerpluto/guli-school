package com.fan.common;

import com.fan.common.constants.ResultConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class R extends HashMap<String,Object>{
    private static final String SUCCESS_TAG = "success";

    private static final String CODE_TAG = "code";

    private static final String MESSAGE_TAG = "message";

    private R(){}

    public static R success(){
        R r = new R();
        r.put(SUCCESS_TAG, "成功");
        r.put(CODE_TAG, 20000);
        return r;
    }

    public static R fail(){
        R r = new R();
        r.put(SUCCESS_TAG,"失败");
        r.put(CODE_TAG, 20001);
        return r;
    }

    public R put(String k, Object v){
        if (Objects.nonNull(v)){
            super.put(k,v);
        }
        return this;
    }
}
