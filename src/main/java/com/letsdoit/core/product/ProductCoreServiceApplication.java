package com.letsdoit.core.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
//@EnableReactiveMongoRepositories
public class ProductCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCoreServiceApplication.class, args);
	}

}
