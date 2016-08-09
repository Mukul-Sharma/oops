package com.webonise.mobile;

import com.webonise.mobile.model.Carrier;
import com.webonise.mobile.model.Mobile;

/**
 * Created by mukuls-webonise on 9/8/16.
 */

//Simple implementation of mobile interface, Delegates carrier for calling responsibility
public class SimpleMobile implements Mobile {

    private boolean isOn;
    private Carrier carrier = new SimpleCarrier();
    private Profile profile = Profile.RINGING;
    private float batteryRemaining = 1.0f;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @Override
    public Carrier getCurrentCarrier() {
        return carrier;
    }

    @Override
    public void dialNumber(String number) {
        disconnect();
        try {
            connectCall(number);
            reduceBattery();
        } catch (NumberNotValidException e) {
            e.printStackTrace();
        }
    }

    private void connectCall(String number) throws NumberNotValidException {
        carrier.connectCall(number);
    }

    @Override
    public String getCurrentCallingNumber() {
        return carrier.getCurrentConnectedNumber();
    }

    @Override
    public void disconnect() {
        carrier.disconnectCurrentCall();
    }

    @Override
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public Profile getCurrentProfile() {
        return profile;
    }

    private void reduceBattery() {
        batteryRemaining -= 0.1f;
    }
    @Override
    public float getBatteryRemaining() {
        return batteryRemaining;
    }
}
