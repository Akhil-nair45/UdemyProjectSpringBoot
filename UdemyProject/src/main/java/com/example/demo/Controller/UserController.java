package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Request.UserRequest;

@RestController
@RequestMapping("/Users")
public class UserController {

	public UserRequest createUser(@RequestBody User user)
	{
		
	}
}
