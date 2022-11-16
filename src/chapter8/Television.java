package chapter8;

public class Television {
    private boolean isOn;
    private int channel;
    private int volume = 1;
    private boolean isMuted;
    private int tempVolume;
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String setTelevision() {
        return "AV";
    }
    public void setChannel(int newChannel) {
        if (isOn && newChannel >= 1 && newChannel <= 120);
        channel = newChannel;

    }



    public void increaseChannel() {
        if (isOn && channel < 120);
        channel++;


    }


    public int getChannel() {
        return channel;
    }

    public void decreaseChannel() {
        if (isOn && channel > 1) channel--;

    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        tempVolume++;
        if (isOn && volume < 7) volume++;
        if (volume > 7)volume = 7;
    }

    public void decreaseVolume() {
        tempVolume--;
        if (isOn && volume > 1) volume--;
        //if (volume < 1) volume = 1
    }


    public void muteVolume() {
        if (isOn)muteTelevision();
    }

    private void muteTelevision() {
        volume = 0;
    }

    public void unmuteVolume() {
        volume = tempVolume;
    }

    public void setVolume(int volumeLevel) {
        if (isOn && volumeLevel >=1 && volumeLevel <= 7);
        volume = volumeLevel;



    }
}
