package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.StudentServiceImpl;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService sr;
	
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody Student st)
	{
		return new ResponseEntity<>(sr.addStudent(st),HttpStatus.CREATED);
	}
	
}
