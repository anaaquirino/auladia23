package com.sesi.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class AutenticacaoController {
	
	@GetMapping
	public String login() {
		return "/login";
	}

}
