package com.bill99.coe.vo.common;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private int status;// 是否成功标志

	private T data;// 成功时返回的数据

	private String msg;// 错误信息

	public Result() {
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", data=" + data + ", msg=" + msg + "]";
	}

}
