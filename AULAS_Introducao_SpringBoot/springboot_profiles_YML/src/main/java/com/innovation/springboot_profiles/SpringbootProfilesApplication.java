package com.innovation.springboot_profiles;

import com.innovation.controller.AppController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.innovation.controller"})
@Controller
@SpringBootApplication
public class SpringbootProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfilesApplication.class, args);
	}

}
