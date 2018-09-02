/**
 * 
 */
package com.tuyou.common;

import java.io.Serializable;

/**
 * @author wudi
 *
 */
// @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BaseModel implements Serializable {

	private static final long serialVersionUID = -1886624091458630956L;

	ResponseModel response;

	public ResponseModel getResponse() {
		return response;
	}

	public void setResponse(ResponseModel response) {
		this.response = response;
	}

}
