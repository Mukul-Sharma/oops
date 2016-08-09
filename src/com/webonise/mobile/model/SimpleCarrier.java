package com.webonise.mobile.model;

import com.webonise.mobile.NumberNotValidException;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class SimpleCarrier implements Carrier {

    private String currentlyCalling;

    @Override
    public void connectCall(String number) throws NumberNotValidException {
        if (isValidNumber(number)) {
            currentlyCalling = number;
        } else {
            throw new NumberNotValidException();
        }
    }

    @Override
    public String getCurrentConnectedNumber() {
        return currentlyCalling;
    }

    @Override
    public void disconnectCurrentCall() {
        currentlyCalling = null;
    }

    private boolean isValidNumber(String number) {
        return null != number && number.length() > 0;
    }

}
