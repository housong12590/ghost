package com.spring.ghost.exception;

public class UserException extends Exception {

    private int errorCode = 1000;

    public UserException(String message) {
        super(message);
    }

    public int getErrCode() {
        return errorCode;
    }
}
