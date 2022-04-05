package com.cg.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class TestException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public TestException(final String str) {
		 super(str);
	 }
	
}
