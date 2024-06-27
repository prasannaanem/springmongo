package com.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.entity.Users;
import com.springmongo.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	
	@Autowired
	private UsersService usersService;
	
	
	@PostMapping("/save")
	public String saveUsers(@RequestBody Users users) {
		
		usersService.saveUsers(users);
		return "users success fully added ";
	}
	

	@GetMapping("/get")
	public List<Users> getUsers(){
		
		return usersService.getUsers();
		
		
		
	}
}



