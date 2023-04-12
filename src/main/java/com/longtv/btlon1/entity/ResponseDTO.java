package com.longtv.btlon1.entity;

public class ResponseDTO<T> {
    private T data;
    private String errorCode;
    private String message;

    public ResponseDTO(T data, String errorCode, String message) {
        this.data = data;
        this.errorCode = errorCode;
        this.message = message;
    }

    public ResponseDTO() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
