package com.testProject.main.form;



import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MainForm {
	
	@NotBlank
	private String name;
	
	private Integer age;
	
	private String address;
}
