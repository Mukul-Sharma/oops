package com.webonise.mobile;

import com.webonise.mobile.model.Mobile;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class Main {

    public static void main(String[] args) {

        Mobile mobile = new SimpleMobile();
        mobile.turnOn();
        log("On", "" + mobile.isOn());
        mobile.setProfile(Mobile.Profile.SILENT);
        log("Profile", "" + mobile.getCurrentProfile());
        mobile.dialNumber("5558889876");
        log("Currently calling", "" + mobile.getCurrentCallingNumber());
        mobile.disconnect();
        log("Currently calling", "" + mobile.getCurrentCallingNumber());
        mobile.turnOff();
        log("Off", "" + !mobile.isOn());
    }

    static void log(String prop, String value) {
        System.out.println(prop + " is " + value);
    }
}
