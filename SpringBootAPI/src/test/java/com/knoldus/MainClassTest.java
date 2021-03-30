package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class MainClassTest {

	@Test
	void contextLoads() {
		 Controller instance = new Controller();

		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
		String str = "Running, {" + localTime.format(dtf) + "}";
		  Assertions.assertEquals(str,instance.showRunning());
	}



}
