package com.smartonet.frame.json;

/**
 * 所有的AJAX请求返回类型，封装JSON结果
 * @author Li
 * @param <T>
 */
public class SmartoNetResult<T> {

	private boolean success ;
	private T data ;
	private String error ;
	
	
	public SmartoNetResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	public SmartoNetResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
