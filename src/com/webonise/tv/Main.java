package com.webonise.tv;

import com.webonise.tv.device.SimpleTV;
import com.webonise.tv.device.Television;
import com.webonise.tv.remote.Remote;
import com.webonise.tv.remote.SimpleRemote;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class Main {

    public static void main(String[] args) {

        Television television = new SimpleTV();
        Remote remote = new SimpleRemote(television);

        remote.turnDeviceOn();
        log("TV", television.isOn() ? "on" : "off");
        remote.enterChannel(77);
        log("Channel", "" + television.getCurrentChannel());
        remote.nextChannel();
        log("Channel", "" + television.getCurrentChannel());
        remote.previousChannel();
        log("Channel", "" + television.getCurrentChannel());
        remote.upVolume();
        log("Volume", "" + television.getCurrentVolume());
        remote.upVolumeBy(10);
        log("Volume", "" + television.getCurrentVolume());
        remote.downVolume();
        log("Volume", "" + television.getCurrentVolume());
        remote.downVolumeBy(5);
        log("Volume", "" + television.getCurrentVolume());
        remote.turnDeviceOff();
        log("TV", television.isOn() ? "on" : "off");
    }

    static void log(String prop, String value) {
        System.out.println(prop + " is " + value);
    }
}
