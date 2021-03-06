package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Scanner;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@EnableCaching
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		while (true){
			String string = new Scanner(System.in).nextLine();
			if(string.equalsIgnoreCase("q")){
				break;
			}

		}
		SpringApplication.exit(context);
	}

}
