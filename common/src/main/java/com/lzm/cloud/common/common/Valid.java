package com.lzm.cloud.common.common;

public class Valid {

	public static Valid SUCCESS = new Valid();
	
	private boolean success = true;
	private Integer code = 100;
	private String msg;
	private Object data;
	private Object other;
	
	
			
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getOther() {
		return other;
	}
	public void setOther(Object other) {
		this.other = other;
	}
	@Override
	public String toString() {
		return "Valid [success=" + success + ", code=" + code + ", msg=" + msg + ", data=" + data + ", other=" + other
				+ "]";
	}
	
	
}
