package com.simplilearn.workshop.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.workshop.model.Welcome;

@RestController
public class WelcomeResource{
	@GetMapping(path = "/messages")
	public Welcome retriveMessage() {
		return new Welcome ("welcome to Simplilearn!");
	}
}
