package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.que1.AppRunner;

@SpringBootApplication
@ComponentScan({ "com.que1.AppRunner" })
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		ConfigurableApplicationContext s=SpringApplication.run(DemoApplication.class, args);
		AppRunner x=s.getBean(AppRunner.class);
	     x.run();
	}

}
