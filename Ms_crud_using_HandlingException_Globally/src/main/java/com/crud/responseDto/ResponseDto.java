package com.crud.responseDto;

import java.util.Date;

public class ResponseDto {
	
private String message;
private Date timstamp;

public ResponseDto()
{
	
}

public ResponseDto(String message, Date timestamp) {
	super();
	this.message = message;
	this.timstamp = timestamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getTimstamp() {
	return timstamp;
}
public void setTimstamp(Date timstamp) {
	this.timstamp = timstamp;
}



}
