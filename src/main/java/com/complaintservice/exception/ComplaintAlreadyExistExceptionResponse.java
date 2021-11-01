/**
 * 
 */
package com.complaintservice.exception;

/**
 * @author Ragini
 *
 */
public class ComplaintAlreadyExistExceptionResponse {

	
	private String loginName;

	/**
	 * @param loginName
	 */
	public ComplaintAlreadyExistExceptionResponse(String loginName) {
		super();
		this.loginName = loginName;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	
	


}
