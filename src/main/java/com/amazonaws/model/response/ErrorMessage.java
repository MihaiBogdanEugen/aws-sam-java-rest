package com.amazonaws.model.response;

public class ErrorMessage {
    private String message;
    private int statusCode;

    public ErrorMessage() {
    }

    public ErrorMessage(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public ErrorMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    public ErrorMessage withStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }
}
