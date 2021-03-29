package com.knoldus;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
  public final class Controller {

    @GetMapping("/status")
    public String showRunning() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter show = DateTimeFormatter.ofPattern("hh:mm:ss");
        return "Running, {" + localTime.format(show) + "}";


    }

}
