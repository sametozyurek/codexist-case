package com.codexist.codexist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.codexist")
public class CodexistApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodexistApplication.class, args);
	}

}
