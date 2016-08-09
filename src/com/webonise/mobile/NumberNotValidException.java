package com.webonise.mobile;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class NumberNotValidException extends Exception {
    public NumberNotValidException() {
        super("Invalid number, cannot parse");
    }
}
