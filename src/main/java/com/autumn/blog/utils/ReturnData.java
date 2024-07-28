package com.autumn.blog.utils;

import com.autumn.blog.constant.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄智龙
 * @description 返回数据
 * @date 2024年07月28日
 * @version: 1.0
 */
public class ReturnData extends HashMap<String, Object> {

    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";
    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";
    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";

    private static final long serialVersionUID = 1L;

    public ReturnData() {
        put(CODE_TAG, HttpStatus.SUCCESS);
        put(MSG_TAG, "success");
        put(DATA_TAG, "");
    }

    public static ReturnData error() {
        return error(HttpStatus.ERROR, "未知异常，请联系管理员");
    }

    public static ReturnData error(String msg) {
        return error(HttpStatus.NOT_FOUND, msg);
    }

    public static ReturnData error(int code, String msg) {
        ReturnData r = new ReturnData();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static ReturnData success() {
        return success(HttpStatus.SUCCESS, "操作成功", "");
    }

    public static ReturnData success(int code) {
        return success(code, "操作成功", "");
    }

    public static ReturnData success(int code, String msg) {
        return success(code, msg, "");
    }

    public static ReturnData success(int code, String msg, Object data) {
        ReturnData r = new ReturnData();
        r.put("code", code);
        r.put("msg", msg);
        r.put("data", data);
        return r;
    }

    public ReturnData put(String key, Object value) {
        super.put(key, value);
        return this;
    }


}
