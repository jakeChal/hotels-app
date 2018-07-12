package com.booking.hotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class FullStackHotelsAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackHotelsAngularSpringBootApplication.class, args);
	}
}
