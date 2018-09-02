/**
 * 
 */
package com.tuyou.common;

import java.io.Serializable;

/**
 * @author wudi
 *
 */
public class ResponseModel implements Serializable {

	private static final long serialVersionUID = 4509481678935782876L;

	private int status;
	
	private String message;

	public ResponseModel(){
		super();
	}

	public ResponseModel(int status, String message){
		super();
		this.status = status;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
