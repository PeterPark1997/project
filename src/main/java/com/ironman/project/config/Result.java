package com.ironman.project.config;

import org.springframework.stereotype.Component;

@Component
public class Result<T> {
    private int status;
    private String message;
    private T data;

    public Result() {
    }

    public Result(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // getters and setters

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // static factory methods for convenience

    public static <T> Result<T> success(T data) {
        return new Result<>(200, "Success", data);
    }
    
    public static <T> Result<T> success(int code,String massage,T data) {
        return new Result<>(200, massage, data);
    }

    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }
    public static <T> Result<T> error(int code,String message) {
        return new Result<>(500, message, null);
    }
}
