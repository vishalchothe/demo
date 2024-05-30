package com.crud.customException;

public class RecordsAreNotPresent extends RuntimeException{
	
 public RecordsAreNotPresent(String msg)
 {
	 super(msg);
 }

}
