package com.webonise.mobile;

import com.webonise.mobile.model.Carrier;
import com.webonise.mobile.model.Mobile;
import com.webonise.mobile.model.SimpleCarrier;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class SimpleMobile implements Mobile {

    private boolean isOn;
    private Carrier carrier = new SimpleCarrier();
    private Profile profile = Profile.RINGING;

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
        } catch (NumberNotvalidException e) {
            e.printStackTrace();
        }
    }

    private void connectCall(String number) throws NumberNotvalidException {
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
}
