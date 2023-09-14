package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetPrevRadioBellowMin() {
        radio.setCurrentStation(0);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevRadioAboveMin() {
        radio.setCurrentStation(1);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentStation(5);
        radio.setCurrentPrevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationBellowMax() {
        radio.setCurrentStation(8);
        radio.setCurrentPrevStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationMax() {
        radio.setCurrentStation(9);
        radio.setCurrentPrevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void ShouldSetNextStationMin() {
        radio.setCurrentStation(0);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNexStationAboveMin() {
        radio.setCurrentStation(1);
        radio.setCurrentNextStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(5);
        radio.setCurrentNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationBellowMax() {
        radio.setCurrentStation(8);
        radio.setCurrentNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationMax() {
        radio.setCurrentStation(9);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationEnlargedBellowMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.setCurrentPrevStation();
        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationEnlargedMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(1);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationEnlarged() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(15);
        radio.setCurrentPrevStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationEnlargedMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.setCurrentPrevStation();
        assertEquals(28, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationEnlargedMin() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationEnlarged() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(15);
        radio.setCurrentNextStation();
        assertEquals(16, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationEnlargedBellowMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(28);
        radio.setCurrentNextStation();
        assertEquals(29, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationEnlargedMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextVolumeMin() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextToVolumeMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMax() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
}
