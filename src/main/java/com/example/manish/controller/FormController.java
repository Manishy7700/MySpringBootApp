package com.example.manish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FormController {
	
	@GetMapping(value="/getForm")
	public String formLoad() {
		return "form";
	}
	
	@PostMapping(value="/sucess")
	public String formData(HttpServletRequest req,Model model) {
		
		return null;
		
	}
}
