package com.demo.web;

import java.io.Serializable;

import lombok.Data;

@Data
public class Reply implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4511717816473351908L;

	private Integer code;
	
	private String msg;
	
	private Object data;
	
	public Reply() {}
	public Reply(Integer code,String msg) {
		new Reply(code,msg,null);
	}
	public Reply(Integer code,String msg,Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public static Reply ok(Object data) {
		return new Reply(0x00,"success",data);
	}
	public static Reply fail(Integer code,String msg) {
		return new Reply(code, msg);
	}
}
