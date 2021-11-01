package com.complaintservice.exception;

/**
 * 
 * @author Ragini
 *
 *ComplaintNotFoundExceptionResponse is response with a login name
 */
@SuppressWarnings("serial")
public class ComplaintNotFoundExceptionResponse extends RuntimeException {

	private String loginName;

	public ComplaintNotFoundExceptionResponse(String loginName) {
		super();
		this.loginName = loginName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
}
