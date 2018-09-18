package com.yqc.manage.exception;

/**
 * 业务异常基类
 * @author yangqc
 */
public class CCException extends RuntimeException {

    private static final long serialVersionUID = -2423902932952356685L;

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
