package com.kutaybezci.buildingmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuildingManagerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BuildingManagerApplication.class, args);
		SpringApplication app = new SpringApplication(BuildingManagerApplication.class);
		app.setBannerMode(org.springframework.boot.Banner.Mode.OFF);
		app.run(args);
	}
}
