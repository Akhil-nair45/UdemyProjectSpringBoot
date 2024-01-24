package com.example.demoService;

import java.util.List;

import com.example.demo.Model.User;

public interface UserService {

	public User createUser(User user);
	public User editUser(User user);
	public List<User> getAllUser();
	public String deleteUser(Integer id);
	public User getById(Integer id);
}
