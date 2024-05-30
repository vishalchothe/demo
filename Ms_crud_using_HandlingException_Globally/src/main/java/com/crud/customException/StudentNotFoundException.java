package com.crud.customException;



public class StudentNotFoundException extends RuntimeException{
	
	
	public StudentNotFoundException(String msg)
	{
		super(msg);
	}

}
