package com.example.demo.vo;

import java.util.HashMap;
import java.util.Map;

public class ResultVO<T> {

    private String message;

    private Integer code;

    private T body;

    public final static ResultVO USER_NOT_FOUND = error("user not found", 1031);


    public ResultVO() {
    }


    public static ResultVO success() {
        Map success = new HashMap();
        success.put("success", true);
        return new ResultVO<>(success);
    }
    public ResultVO(T body) {
        this.body = body;
        message = "";
        code = 0;
    }

    public static ResultVO error(String message, Integer code) {
        return new ResultVO<>(message, code, null);
    }

    public ResultVO(String message, Integer code, T body) {
        this.message = message;
        this.code = code;
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
