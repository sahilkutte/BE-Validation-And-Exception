package com.example.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> exception(MethodArgumentNotValidException ex)
	{
		Map<String,String> errorMap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(errror->{
			errorMap.put(errror.getField(), errror.getDefaultMessage());
		});
		return errorMap;

	}
	 
}
