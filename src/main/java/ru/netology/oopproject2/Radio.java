package ru.netology.oopproject2;

public class Radio {

    private int currentStation;
    private int currentVolume;

    //________________УСТАНОВКА СТАНЦИИ___________________________
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //_______________________УВЕЛИЧЕНИЕ СТАНЦИИ__________________________
    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    //______________________УМЕНЬШЕНИЕ СТАНЦИИ______________________________
    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    //____________________УВЕЛИЧЕНИЕ ЗВУКА______________________________________________________
    public void moreSound() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    //____________________УМЕНЬШЕНИЕ ЗВУКА______________________________________________________
    public void lessSound() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
