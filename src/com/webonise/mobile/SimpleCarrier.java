package com.webonise.mobile;

import com.webonise.mobile.NumberNotValidException;
import com.webonise.mobile.model.Carrier;

/**
 * Created by mukuls-webonise on 9/8/16.
 */

//Simple implementation for Carrier interface
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
