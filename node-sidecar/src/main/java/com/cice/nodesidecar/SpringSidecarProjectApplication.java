package com.cice.nodesidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class SpringSidecarProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringSidecarProjectApplication.class, args);
	}
}
