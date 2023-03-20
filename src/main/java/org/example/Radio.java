package org.example;

public class Radio {
    private String name;
    private int currentStation;
    private int currentVolume;
    private int amountRadioStation = 10;
    private int minStationNumber = 0;
    private final int maxStationNumber = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on = true;

    public Radio () {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setAmountRadioStation(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStationNumber) {
            return;
        }
        if (currentStation > maxStationNumber) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation >= maxStationNumber) {
            setCurrentStation(minStationNumber);
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void downStation() {
        if (currentStation <= minStationNumber) {
            setCurrentStation(maxStationNumber);
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(minVolume);
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(maxVolume);
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}












