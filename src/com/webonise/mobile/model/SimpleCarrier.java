package com.webonise.mobile.model;

import com.webonise.mobile.NumberNotvalidException;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class SimpleCarrier implements Carrier {

    private String currentlyCalling;

    @Override
    public void connectCall(String number) throws NumberNotvalidException {
        if (isValidNumber(number)) {
            currentlyCalling = number;
        } else {
            throw new NumberNotvalidException();
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
