/**
 * 
 */
package com.complaintservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.*;

/**
 * @author Ragini
 *
 */
@Service
public class MapValidationErrorService {
	
	/**
	 * This method is used to process the errors in the result of the validation
	 * 
	 * @param result of the validation
	 * @return ResponseEntity with errors if found otherwise null.
	 */
	public ResponseEntity<?> mapValidationError(BindingResult result) {
		Map<String, String> errorMap = new HashMap<>();
		if (result.hasErrors()) {
			for (FieldError fieldError : result.getFieldErrors()) {
				errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}
		return null;

	}

}
