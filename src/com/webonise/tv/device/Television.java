package com.webonise.tv.device;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public interface Television {

    void turnOn();

    void turnOff();

    boolean isOn();

    int getTotalChannels();

    void nextChannel();

    void previousChannel();

    int getCurrentChannel();

    int setChannel(int channelNo);

    int getCurrentVolume();

    void upVolume();

    void downVolume();

    void upVolumeBy(int amount);

    void downVolumeBy(int amount);

    int getMaxVolume();

}
