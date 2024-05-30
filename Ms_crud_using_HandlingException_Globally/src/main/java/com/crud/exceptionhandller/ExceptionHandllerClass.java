package com.crud.exceptionhandller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crud.customException.StudentNotFoundException;
import com.crud.responseDto.ResponseDto;

@RestControllerAdvice
public class ExceptionHandllerClass {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ResponseDto> checkData(StudentNotFoundException s)
	{
		ResponseDto rr=new ResponseDto();
		rr.setMessage(s.getMessage());
		rr.setTimstamp(new Date());
		return new ResponseEntity<ResponseDto>(rr, HttpStatus.OK);
	}

}
