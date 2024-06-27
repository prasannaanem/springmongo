package com.springmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.entity.Users;
import com.springmongo.repository.UsersRepo;

@Service
public class UsersService {

	@Autowired
	private UsersRepo usersRepo;
	
	
	
	public Users saveUsers(Users users) {
		return usersRepo.save(users);

	}
	
	
	public List<Users> getUsers(){
		return usersRepo.findAll();
	}
}
