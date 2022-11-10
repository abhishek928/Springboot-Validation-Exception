package com.springboot.validationapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {


	@NotNull(message = "Username shouldn't be Null")
	private String name;
	@Email(message = "Invalid Email Address")
	private String email;
	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number entered")
	private String mobile;
	@NotNull
	private String gender;
	@Min(18)
	@Max(60)
	private int age;
	@NotNull
	private String nationality;
	
	
	
	
}
