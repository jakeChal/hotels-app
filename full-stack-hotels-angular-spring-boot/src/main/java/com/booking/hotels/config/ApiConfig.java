package com.booking.hotels.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Configuration
public class ApiConfig {

	//json to pojo
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
	
	//pojo to json
	@Bean
	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return objectMapper.writerWithDefaultPrettyPrinter();
	}
}
