package com.demo.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6448039218841534130L;

	private Integer userId;

    private String userName;

    private String password;

    private String phone;

}