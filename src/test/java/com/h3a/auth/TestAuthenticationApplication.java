package com.h3a.auth;

import org.springframework.boot.SpringApplication;

public class TestAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.from(AuthenticationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
