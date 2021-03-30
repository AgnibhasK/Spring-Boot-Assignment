package com.knoldus;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ControllerTest {

    @org.junit.Test
    public void showRunningTest() {
        Controller instance = new Controller();

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        String str = "Running, {" + localTime.format(dtf) + "}";
        Assertions.assertEquals(str,instance.showRunning());
    }
}