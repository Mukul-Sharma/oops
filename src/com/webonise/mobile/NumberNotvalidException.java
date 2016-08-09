package com.webonise.mobile;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class NumberNotvalidException extends Exception {
    public NumberNotvalidException() {
        super("Invalid number, cannot parse");
    }
}
