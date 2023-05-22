package com.sda.she_likes_java.exeptions;

public class MyBrokenException {
    private String message;

    public MyBrokenException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MyBrokenException{" +
                "message='" + message + '\'' +
                '}';
    }

}
