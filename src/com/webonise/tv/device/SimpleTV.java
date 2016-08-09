package com.webonise.tv.device;

/**
 * Created by mukuls-webonise on 9/8/16.
 */

//Simple implementation for Television interface

public class SimpleTV implements Television {

    private final static int MAX_VOLUME = 30;
    private final static int MAX_CHANNELS = 200;

    private boolean turnedOn;
    private int currentChannel;
    private int currentVolume;
    private int maxVolume = MAX_VOLUME;
    private int maxChannels = MAX_CHANNELS;

    @Override
    public void turnOn() {
        turnedOn = true;
    }

    @Override
    public void turnOff() {
        turnedOn = false;
    }

    @Override
    public boolean isOn() {
        return turnedOn;
    }

    protected void setTotalChannels(int channelCount) {
        if (isValidChannelCount(channelCount)) {
            this.maxChannels = channelCount;
        }
    }

    private boolean isValidChannelCount(int count) {
        return count > 0;
    }

    @Override
    public int getTotalChannels() {
        return maxChannels;
    }

    @Override
    public void nextChannel() {
        int channelToSet = getCurrentChannel() + 1;
        setChannel(channelToSet);
    }

    @Override
    public void previousChannel() {
        int channelToSet = getCurrentChannel() - 1;
        setChannel(channelToSet);
    }

    @Override
    public int getCurrentChannel() {
        return currentChannel;
    }

    @Override
    public int setChannel(int channelNo) {
        if(isValidChannel(channelNo)) {
            this.currentChannel = channelNo;
        }
        return currentChannel;
    }

    private boolean isValidChannel(int channelNo) {
        return  channelNo > 0 && channelNo <= maxChannels;
    }

    @Override
    public int getCurrentVolume() {
        return currentVolume;
    }

    @Override
    public void upVolume() {
        upVolumeBy(1);
    }

    @Override
    public void downVolume() {
        downVolumeBy(1);
    }

    @Override
    public void upVolumeBy(int amount) {
        int toSet = getCurrentVolume() + amount;
        setVolume(toSet);
    }

    @Override
    public void downVolumeBy(int amount) {
        int toSet = getCurrentVolume() - amount;
        setVolume(toSet);
    }

    private int setVolume(int volume) {
        if (isValidVolume(volume)) {
            this.currentVolume = volume;
        }
        return currentVolume;
    }

    private boolean isValidVolume(int volume) {
        return volume >=0 && volume <= MAX_VOLUME;
    }

    @Override
    public int getMaxVolume() {
        return maxVolume;
    }

    protected void setMaxVolume(int volume) {
        if (isValidMaxVolume(volume)) {
            this.maxVolume = volume;
        }
    }

    private boolean isValidMaxVolume(int volume) {
        return volume >=0;
    }
}
