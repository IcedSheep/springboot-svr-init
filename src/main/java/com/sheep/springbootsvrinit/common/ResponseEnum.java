package com.sheep.springbootsvrinit.common;

/**
 * 响应枚举
 */
public enum ResponseEnum {

    SUCCESS(0,"success"),
    FAIL(1,"failed"),
    ERR_INPUT_INVALID ( 8020, "input invalid");

    private int code;

    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 获取枚举中的code message
     */
    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
