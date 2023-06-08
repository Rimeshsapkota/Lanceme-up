package com.rimesh.usermanagement;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);

	}
	@Bean
	public OpenAPI customApi(@Value("${springdoc.version}") String version){
		return new OpenAPI().components(new Components()).info(new Info().title("user-management").version(version));
	}

}
