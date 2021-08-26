package com.napptilus.zaraprices.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoSuchElementFoundExceptionTest {

	@Test
	void testNoSuchElementFoundException() {
		assertNotNull(new NoSuchElementFoundException(null));
	}

}
