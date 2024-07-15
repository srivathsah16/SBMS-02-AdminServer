package com.srivath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Sbms02AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms02AdminServerApplication.class, args);
	}

}
