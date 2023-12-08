package com.example.sampleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/hi")
public class Controller1 {

	@GetMapping
	public String getTreeById() {
		return "Hello";
	}
}
