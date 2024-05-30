package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Students;
import com.crud.service.StudentService;

@RestController
public class SchoolController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<Students>> getAllData()
	{
		List<Students> list=ss.getAll();
		
		return new ResponseEntity<List<Students>>(list,HttpStatus.OK);
	}

}
