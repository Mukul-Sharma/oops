package com.webonise.tv;

import com.webonise.tv.device.SimpleTV;
import com.webonise.tv.device.Television;
import com.webonise.tv.remote.SimpleRemote;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class Main {

    public static void main(String[] args) {

        Television television = new SimpleTV();
        Remote TVRemote = new SimpleRemote(television);

        TVRemote.turnDeviceOn();
        log("TV", television.isOn() ? "on" : "off");
        TVRemote.enterChannel(77);
        log("Channel", "" + television.getCurrentChannel());
        TVRemote.nextChannel();
        log("Channel", "" + television.getCurrentChannel());
        TVRemote.previousChannel();
        log("Channel", "" + television.getCurrentChannel());
        TVRemote.upVolume();
        log("Volume", "" + television.getCurrentVolume());
        TVRemote.upVolumeBy(10);
        log("Volume", "" + television.getCurrentVolume());
        TVRemote.downVolume();
        log("Volume", "" + television.getCurrentVolume());
        TVRemote.downVolumeBy(5);
        log("Volume", "" + television.getCurrentVolume());
        TVRemote.turnDeviceOff();
        log("TV", television.isOn() ? "on" : "off");
    }

    private static void log(String prop, String value) {
        System.out.println(prop + " is " + value);
    }
}
