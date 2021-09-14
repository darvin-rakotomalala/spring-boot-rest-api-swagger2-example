package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootRestApiSwagger2ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiSwagger2ExampleApplication.class, args);
	}

}
