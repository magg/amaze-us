package com.eureka.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * UI service app
 *
 * @author Miguel Gonzalez (maggonzz@gmail.com)
 * @since 0.0.1
 */
@SpringBootApplication
@EnableEurekaClient
public class UiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UiApplication.class);
	}
}
