package com.complaintservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Ragini
 *
 * The ComplaintNotFoundException handle When Complaint not found 
 *
 */
@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class ComplaintNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public ComplaintNotFoundException() {
		super();
		
	}
	public ComplaintNotFoundException(String message) {
		super(message);
	}
}
