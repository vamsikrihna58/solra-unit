package com.Solera_1_forunittesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Solera_1_forunittesting.Service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService us;
	
	@GetMapping("add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return us.add(a, b);
		
	}
	 @GetMapping("/even/{i}")
	    public boolean isEvenOrNot(@PathVariable int i) {
	        return us.isEvenOrNot(i);
	    }
}
