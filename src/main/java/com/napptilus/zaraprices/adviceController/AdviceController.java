package com.napptilus.zaraprices.adviceController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.springframework.core.NestedRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import com.napptilus.zaraprices.exception.NoSuchElementFoundException;

import lombok.Data;
import lombok.NoArgsConstructor;

@ControllerAdvice
public class AdviceController {

	@ResponseBody
	@ExceptionHandler(NoSuchElementFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	ErrorFormat notFound(NoSuchElementFoundException ex, HttpServletRequest request) {
		return toError(ex, request);
	}

	@ResponseBody
	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ErrorFormat badConstraint(ConstraintViolationException ex, HttpServletRequest request) {
		return toError(ex, request);
	
	}
	
	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ErrorFormat badArguments(MethodArgumentNotValidException ex, HttpServletRequest request) {
		return toError(ex, request);
	}
	

	@ResponseBody
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ErrorFormat badFormat(HttpMessageNotReadableException ex, HttpServletRequest request) {
		return toError(ex, request);
	}
	
	private ErrorFormat toError(BindException ex, HttpServletRequest request) {
		ErrorFormat error = new ErrorFormat();
		error.setTimestamp(Instant.now());
		error.setPath(request.getServletPath());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
		List<String> causes=new ArrayList<>();
		List<ObjectError> errors= ex.getAllErrors();
		for (ObjectError objectError : errors) {
			causes.add(objectError.getDefaultMessage());
		}
		error.setCauses(causes);
		return error;
	}
	
	
	private ErrorFormat toError(NestedRuntimeException ex, HttpServletRequest request) {
		ErrorFormat error = new ErrorFormat();
		error.setTimestamp(Instant.now());
		error.setPath(request.getServletPath());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
		List<String> causes=new ArrayList<>();
		causes.add(ex.getMostSpecificCause().getMessage());
		error.setCauses(causes);
		return error;
	}

	private ErrorFormat toError(RuntimeException ex, HttpServletRequest request) {
		ErrorFormat error = new ErrorFormat();
		error.setTimestamp(Instant.now());
		error.setPath(request.getServletPath());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
		List<String> causes=new ArrayList<>();
		causes.add(ex.getMessage());
		error.setCauses(causes);
		return error;
	}

	private ErrorFormat toError(ResponseStatusException ex, HttpServletRequest request) {
		ErrorFormat error = new ErrorFormat();
		error.setTimestamp(Instant.now());
		error.setPath(request.getServletPath());
		error.setStatus(ex.getStatus().value());
		error.setError(ex.getStatus().getReasonPhrase());
		List<String> causes=new ArrayList<>();
		causes.add(ex.getMessage());
		error.setCauses(causes);
		return error;
	}

	@Data
	@NoArgsConstructor
	class ErrorFormat {
		
		Instant timestamp;
		
		Integer status;
		
		String error;
		
		List<String> causes;
		
		String path;
	}
}
