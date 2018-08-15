package com.heyiming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BusinessTripApplication {

	public static void main(String[] args){
		SpringApplication.run(BusinessTripApplication.class, args);
	}
}
