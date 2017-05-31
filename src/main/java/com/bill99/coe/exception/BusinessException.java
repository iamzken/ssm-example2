package com.bill99.coe.exception;

/**
 * 业务异常封装类
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = -6416143509907982311L;

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}
