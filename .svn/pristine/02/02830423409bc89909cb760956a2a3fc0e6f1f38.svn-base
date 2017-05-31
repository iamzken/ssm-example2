package com.bill99.coe.enums;

/**
 * 使用枚举表述结果常量
 */
public enum ResultEnum {

	SUCCESS(0, "成功"), 
	FAIL(1, "系统异常");

	private int status;

	private String msg;

	private ResultEnum(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}

	public static ResultEnum indexOf(int index) {
		for (ResultEnum state : values()) {
			if (state.getStatus() == index) {
				return state;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ResultEnum num = ResultEnum.SUCCESS;
		int a = num.getStatus();
		String b = num.getMsg();
		System.out.println(a+"---"+b);
	}

}
