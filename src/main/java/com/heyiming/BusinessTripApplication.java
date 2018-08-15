package com.heyiming;

import com.heyiming.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ImportAutoConfiguration(value = {
	WebSecurityConfig.class
})
public class BusinessTripApplication {

	public static void main(String[] args){
		SpringApplication springApplication = new SpringApplication(BusinessTripApplication.class);
		springApplication.run(args);
	}
}
