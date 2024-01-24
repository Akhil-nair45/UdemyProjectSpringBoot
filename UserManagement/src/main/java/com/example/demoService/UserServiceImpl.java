package com.example.demoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepo ur;
	
	
	@Override
	public User createUser(User user) {
		return ur.save(user);
	}

	@Override
	public User editUser(User user) {
		return ur.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return ur.findAll();
	}

	@Override
	public String deleteUser(Integer id) {
		Optional<User> user= ur.findById(id);
		if(user!=null)
		{
			ur.delete((User) ur);
			return "User deleted successfully!";
		}
		return "some error occured";
	}

	@Override
	public User getById(Integer id) {
		return ur.findById(id).get();
	}

}
