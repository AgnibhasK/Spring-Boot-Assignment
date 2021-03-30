package com.knoldus;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControllerTest {

    @org.junit.Test
    public void showRunningTest() {
        Controller instance = new Controller();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);

        assertEquals(instance.showRunning(), "Running, " + formatDateTime);
    }
}