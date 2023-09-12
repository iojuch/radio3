package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetNumberStationBellowTheMin() {
        radio.setCurrentNumberStation(-1);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationMin() {
        radio.setCurrentNumberStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationAboveMin() {
        radio.setCurrentNumberStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentNumberStation() {
        radio.setCurrentNumberStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationBellowTheMax() {
        radio.setCurrentNumberStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationMax() {
        radio.setCurrentNumberStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStationAboveTheMax() {
        radio.setCurrentNumberStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationMin() {
        radio.setCurrentNumberStation(0);
        radio.setCurrentNextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentNumberStation(8);
        radio.setCurrentNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationMax() {
        radio.setCurrentNumberStation(9);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAboveTheMax() {
        radio.setCurrentNumberStation(10);
        radio.setCurrentNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevBellowTheMin() {
        radio.setCurrentNumberStation(-1);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevMinStation() {
        radio.setCurrentNumberStation(0);
        radio.setCurrentPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        radio.setCurrentNumberStation(1);
        radio.setCurrentPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationMax() {
        radio.setCurrentNumberStation(9);
        radio.setCurrentPrevStation();
        assertEquals(8, radio.getCurrentStation());
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
    public  void shouldSetNextToVolumeMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeBellowTheMin() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeMax() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolumeAboveTheMax() {
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

}
