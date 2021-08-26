package com.napptilus.zaraprices.adviceController;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.napptilus.zaraprices.exception.NoSuchElementFoundException;

@ExtendWith(MockitoExtension.class)
class AdviceControllerTest {

	@Mock
	HttpServletRequest request;
	
	@Test
	void constructor() {
		AdviceController instance=new AdviceController();
		assertNotNull(instance);
	}
	
	@Test
	void testNotFoundNullPointer() {
		AdviceController instance=new AdviceController();
		assertThrows(NullPointerException.class, () -> {
			instance.notFound(null, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			instance.notFound(new NoSuchElementFoundException("mess"), null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			instance.notFound(null, request);
		});
	}
	
	@Test
	void testNotFoundValid() {
		AdviceController instance=new AdviceController();
		assertNotNull(instance.notFound(new NoSuchElementFoundException("mess"), request));
	}

	@Test
	void testBadConstraintNullPointer() {
		AdviceController instance=new AdviceController();
		assertThrows(NullPointerException.class, () -> {
			instance.badConstraint(null, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			ConstraintViolationException ex=Mockito.mock(ConstraintViolationException.class);
			instance.badConstraint(ex , null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			instance.badConstraint(null, request);
		});
	}

	
	@Test
	void testBadConstraintValid() {
		AdviceController instance=new AdviceController();
		ConstraintViolationException ex=Mockito.mock(ConstraintViolationException.class);
		assertNotNull(instance.badConstraint(ex, request));
	}

	
	@Test
	void testBadArguments() {
		AdviceController instance=new AdviceController();
		assertThrows(NullPointerException.class, () -> {
			instance.badArguments(null, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			MethodArgumentNotValidException ex=Mockito.mock(MethodArgumentNotValidException.class);
			instance.badArguments(ex , null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			instance.badArguments(null, request);
		});
	}

	@Test
	void testBadArgumentsValid() {
		AdviceController instance=new AdviceController();
		MethodArgumentNotValidException ex=Mockito.mock(MethodArgumentNotValidException.class);
		assertNotNull(instance.badArguments(ex, request));
	}

	
	
	@Test
	void testBadFormatNull() {
		AdviceController instance=new AdviceController();
		assertThrows(NullPointerException.class, () -> {
			instance.badFormat(null, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			HttpMessageNotReadableException ex=Mockito.mock(HttpMessageNotReadableException.class);
			instance.badFormat(ex , null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			instance.badFormat(null, request);
		});
	}
	
	
	@Test
	void testBadFormatValid() {
		AdviceController instance=new AdviceController();
		Throwable tw=Mockito.mock(Throwable.class);
		HttpMessageNotReadableException ex=Mockito.mock(HttpMessageNotReadableException.class);
		when(ex.getMostSpecificCause()).thenReturn(tw);
		assertNotNull(instance.badFormat(ex, request));
	}

}
