package com.amari.character_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.amari.character_api")
public class CharacterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharacterApiApplication.class, args);
	}

}
