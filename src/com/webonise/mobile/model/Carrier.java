package com.webonise.mobile.model;

import com.webonise.mobile.NumberNotvalidException;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public interface Carrier {

    void connectCall(String number) throws NumberNotvalidException;

    String getCurrentConnectedNumber();

    void disconnectCurrentCall();
}
