package org.example.lab19.ex1;

public class INNException extends Exception{
    public INNException() {
    }

    public INNException(String message) {
        super(message);
    }

    public INNException(String message, Throwable cause) {
        super(message, cause);
    }

    public INNException(Throwable cause) {
        super(cause);
    }

    public INNException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
