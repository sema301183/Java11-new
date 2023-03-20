package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void createRadio() {
        String expected = "Radio";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    void shouldNotSetStationBelowMin() {
        radio.setCurrentStation(6);

        radio.setCurrentStation(-1);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationAboveMax() {
        radio.setCurrentStation(7);

        radio.setCurrentStation(10);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void increaseStation() {
        radio.setCurrentStation(5);

        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void transitionFromMaxToMinStation() {
        radio.setCurrentStation(9);

        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void downStation() {
        radio.setCurrentStation(3);

        radio.downStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void transitionFromMimToMaxStation() {
        radio.setCurrentStation(0);

        radio.downStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetVolumeBelowMin() {
        radio.setCurrentVolume(8);

        radio.setCurrentVolume(-1);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeAboveMax() {
        radio.setCurrentVolume(100);

        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        radio.setCurrentVolume(6);

        radio.increaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void transitionFromMaxToMinVolume() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void downVolume() {
        radio.setCurrentVolume(6);

        radio.downVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void transitionFromMinToMaxVolume() {
        radio.setCurrentVolume(0);

        radio.downVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

}
