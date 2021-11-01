/**
 * 
 */
package com.complaintservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Ragini
 *
 */
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleInvalidIdException(InvalidIdException ex,
			WebRequest request) {

		InvalidIdExceptionResponse exceptionResponse = new InvalidIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);
	}	
	@ExceptionHandler
	public final ResponseEntity<Object> handleComplaintNotFoundException(ComplaintNotFoundException ex,
			WebRequest request){
		
		ComplaintNotFoundExceptionResponse exceptionResponse=new ComplaintNotFoundExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public final ResponseEntity<Object> handleComplaintAlreadyExistException(ComplaintAlreadyExistException ex, WebRequest request){
		ComplaintAlreadyExistExceptionResponse exceptionResponse=new ComplaintAlreadyExistExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
