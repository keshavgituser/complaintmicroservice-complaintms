package com.complaintservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * @author Ragini
 *
 */
@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ComplaintAlreadyExistException extends RuntimeException {
	private static final long serialVErsionUID =1L;
	/**
	 * Create ComplaintAlreadyExistException without Error message
	 */
	public ComplaintAlreadyExistException() {
		super();
	}

	public ComplaintAlreadyExistException(String message) {
		super(message);
	}
	
}
