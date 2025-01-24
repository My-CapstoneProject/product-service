package com.sr.product_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserPojo {
	
	private int userId;
	private String username;
	private String password;
	private int roleId;

}