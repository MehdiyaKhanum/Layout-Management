package com.layoutmanagement.Layout_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableJpaRepositories
public class LayoutManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(LayoutManagementApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
        return "Hello, Layout Management!";
    }
}
