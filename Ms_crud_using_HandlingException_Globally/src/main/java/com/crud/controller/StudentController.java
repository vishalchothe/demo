package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Students;
import com.crud.service.StudentService;

@RestController
public class StudentController {

@Autowired
StudentService si;

@PostMapping("/addData")
public ResponseEntity<Students> addData(@RequestBody Students s)
{
	si.addData(s);
	
	return new ResponseEntity<Students>(s, HttpStatus.OK);
}

@GetMapping("/getData/{id}")
public ResponseEntity<Students> getData(@PathVariable int id)
{
	Students s=si.getOne(id);
	
	return new ResponseEntity<Students>(s, HttpStatus.OK);
}
}
