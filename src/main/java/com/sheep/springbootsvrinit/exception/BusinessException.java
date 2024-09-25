package com.sheep.springbootsvrinit.exception;

import com.sheep.common.ErrorCode;
import com.sheep.common.ResponseEnum;

/**
 * 自定义异常类
 *
 * 
 * 
 */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ResponseEnum responseEnum) {
        super(responseEnum.message());
        this.code = responseEnum.code();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
