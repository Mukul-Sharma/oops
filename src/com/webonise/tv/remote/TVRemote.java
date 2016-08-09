package com.webonise.tv.remote;

/**
 * Created by mukuls-webonise on 9/8/16.
 */
public interface TVRemote {

    void turnDeviceOn();

    void turnDeviceOff();

    void enterChannel(int channelNo);

    void nextChannel();

    void previousChannel();

    void upVolume();

    void downVolume();

    void upVolumeBy(int amount);

    void downVolumeBy(int amount);

}
