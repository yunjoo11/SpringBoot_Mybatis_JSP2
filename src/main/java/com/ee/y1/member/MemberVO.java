package com.ee.y1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	@Length(min=4, max=10)
	private String password;
	
	@NotEmpty //name은 null이 아니여야 한다는 의미
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	//0이상 200이하
	@Range(min=0, max=200)
	@NotEmpty
	private String phone;

}
