package com.example.exceptions.basics;


public class IdNotFoundException extends MyException {
    private long id;

    public IdNotFoundException(long id) {
        this.id = id;
    }

    public IdNotFoundException(long id, String message) {
        super(message);
        this.id = id;
    }

    public IdNotFoundException(long id, String message, Throwable cause) {
        super(message, cause);
        this.id = id;
    }

    public IdNotFoundException(long id, Throwable cause) {
        super(cause);
        this.id = id;
    }

    public IdNotFoundException(long id, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.id = id;
    }

    public long getId() {
        return id;
    }

}
