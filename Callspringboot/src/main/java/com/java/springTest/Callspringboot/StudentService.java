package com.java.springTest.Callspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	
//	@RequestMapping("/add")
	@PostMapping("/add")
	public String addData(Student stu) {
		stu.setName("New");
		System.out.println("Name Added");
		repo.save(stu);
		return "Name Added";
		
	}

}
