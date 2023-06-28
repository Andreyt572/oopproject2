package ru.netology.oopproject2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //_______________________________ВЫСТАВЛЕНИЕ СТАНЦИИ____________________________________________________________
    @Test
    public void shouldSetRadioStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation10() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    //________________________________________________________________________________________________________________

    //__________________________________ВЫСТАВЛЕНИЕ ЗВУКА____________________________________________
    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //___________________________________УВЕЛИЧЕНИЕ СТАНЦИИ_____________________________________________
    @Test
    public void nextStation0() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ СТАНЦИИ (0)
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ СТАНЦИИ (1)
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation8() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ СТАНЦИИ (8)
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ СТАНЦИИ (9)
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    //________________________________________________________________________________________________________________

    //___________________________________УМЕНЬШЕНИЕ СТАНЦИИ___________________________________________________________

    @Test
    public void prevStation5() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ СТАНЦИИ (5)
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation0() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ СТАНЦИИ (0)
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation1() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ СТАНЦИИ (1)
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation9() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ СТАНЦИИ (9)
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation8() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ СТАНЦИИ (8)
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    //________________________________________________________________________________________________________________

    //______________________________________УВЕЛИЧЕНИЕ ЗВУКА__________________________________________________________
    @Test
    public void moreSound() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ ЗВУКА (0)
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.moreSound();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreSound1() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ ЗВУКА (1)
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.moreSound();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreSound50() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ ЗВУКА (50)
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.moreSound();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreSound99() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ ЗВУКА (99)
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.moreSound();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreSound100() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УВЕЛИЧЕНИЯ ЗВУКА (100)
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.moreSound();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
//______________________________________________________________________________________________

    //_____________________УМЕНЬШЕНИЕ ЗВУКА_____________________________________
    @Test
    public void lessSound100() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ ЗВУКА (100)
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.lessSound();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessSound99() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ ЗВУКА (99)
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.lessSound();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessSound50() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ ЗВУКА (50)
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.lessSound();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessSound1() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ ЗВУКА (1)
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.lessSound();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessSound0() { //ГРАНИЧНЫЕ ЗНАЧЕНИЯ УМЕНЬШЕНИЯ ЗВУКА (0)
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lessSound();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
