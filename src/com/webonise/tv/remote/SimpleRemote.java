package com.webonise.tv.remote;

import com.webonise.tv.device.Television;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public class SimpleRemote implements Remote {

    private Television television;

    public SimpleRemote(Television television) {
        this.television = television;
    }

    @Override
    public void turnDeviceOn() {
        television.turnOn();
    }

    @Override
    public void turnDeviceOff() {
        television.turnOff();
    }

    @Override
    public void enterChannel(int channelNo) {
        television.setChannel(channelNo);
    }

    @Override
    public void nextChannel() {
        television.nextChannel();
    }

    @Override
    public void previousChannel() {
        television.previousChannel();
    }

    @Override
    public void upVolume() {
        television.upVolume();
    }

    @Override
    public void downVolume() {
        television.downVolume();
    }

    @Override
    public void upVolumeBy(int amount) {
        television.upVolumeBy(amount);
    }

    @Override
    public void downVolumeBy(int amount) {
        television.downVolumeBy(amount);
    }
}
