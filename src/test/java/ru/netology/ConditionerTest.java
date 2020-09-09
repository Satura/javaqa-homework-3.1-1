package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {


    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(12);
        conditioner.setMaxTemperature(26);
        conditioner.setCurrentTemperature(20);

        conditioner.increaseCurrentTemperature();
        assertEquals(21,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(22,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(23,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(24,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(25,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(26,conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(26,conditioner.getCurrentTemperature());

    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(12);
        conditioner.setMaxTemperature(26);
        conditioner.setCurrentTemperature(15);

        conditioner.decreaseCurrentTemperature();
        assertEquals(14, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(13, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(12, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(12, conditioner.getCurrentTemperature());

    }

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(12);
        conditioner.setMaxTemperature(26);

        conditioner.setCurrentTemperature(10);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(30);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

    }
}