package com.chainsys.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class SpringbootdemoApplication {
	
	public static void main(String[] args) {		
		SpringApplication.run(SpringbootdemoApplication.class, args);
		
	}

}
