package com.webonise.mobile.model;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public interface Mobile {

    enum Profile {
        RINGING, SILENT
    }

    void turnOn();

    void turnOff();

    boolean isOn();

    void setCarrier(Carrier carrier);

    Carrier getCurrentCarrier();

    void dialNumber(String number);

    String getCurrentCallingNumber();

    void disconnect();

    void setProfile(Profile profile);

    Profile getCurrentProfile();

    float getBatteryRemaining();
}
