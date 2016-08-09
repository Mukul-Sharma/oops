package com.webonise.tv.remote;

/**
 * Created by mukuls-webonise on 9/8/16.
 */

//Abstraction for remote clients
public interface TVRemoteClient {

    void turnOn();

    void turnOff();

    int setChannel(int channelNo);

    void nextChannel();

    void previousChannel();

    void upVolume();

    void downVolume();

    void upVolumeBy(int amount);

    void downVolumeBy(int amount);

}
