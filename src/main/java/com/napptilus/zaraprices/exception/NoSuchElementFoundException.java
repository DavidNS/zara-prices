package com.napptilus.zaraprices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NoSuchElementFoundException extends ResponseStatusException {

	private static final long serialVersionUID = 7437359490134865655L;

	public NoSuchElementFoundException(String message) {
		super(HttpStatus.NOT_FOUND, message);
	}
}
