package com.heyiming.hotel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailSenderController {

	@RequestMapping("/send")
	public String sendMail(){
		return "send success";
	}
}
