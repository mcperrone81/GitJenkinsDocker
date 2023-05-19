package com.perrone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootTest
@RequestMapping("/")
class Programma {
	
	@GetMapping(value = "/Messaggio")
	public String getMessage() {
		return "Test GitHub Jenkins Docker SUPERATO!!!!";
	}

	@Test
	void contextLoads() {
	}

}
