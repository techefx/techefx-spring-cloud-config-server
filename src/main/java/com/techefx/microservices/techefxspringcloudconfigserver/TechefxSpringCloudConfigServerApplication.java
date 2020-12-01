package com.techefx.microservices.techefxspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TechefxSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechefxSpringCloudConfigServerApplication.class, args);
	}

}
