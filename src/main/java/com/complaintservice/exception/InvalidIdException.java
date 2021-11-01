/**
 * 
 */
package com.complaintservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Sanjeet
 *
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidIdException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
		public InvalidIdException() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param message
		 * This class Displays message of exception
		 */
		public InvalidIdException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	}