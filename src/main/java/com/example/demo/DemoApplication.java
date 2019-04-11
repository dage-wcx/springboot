package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

@ServletComponentScan
@SpringBootApplication
@MapperScan("com.example.demo.mapper")
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
