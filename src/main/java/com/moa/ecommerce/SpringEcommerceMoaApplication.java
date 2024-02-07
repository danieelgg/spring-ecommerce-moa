package com.moa.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcommerceMoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceMoaApplication.class, args);
	}

}
