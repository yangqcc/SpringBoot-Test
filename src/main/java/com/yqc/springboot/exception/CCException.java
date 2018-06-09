package com.yqc.springboot.exception;

/**
 * 业务异常基类
 */
public class CCException extends RuntimeException {

    public CCException() {
        super();
    }

    public CCException(String message) {
        super(message);
    }


    public CCException(String message, Throwable cause) {
        super(message, cause);
    }

}
