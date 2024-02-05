package com.vivek.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Student_Details")
public class Student {
	
	@Id
	private Integer sId;
	private String sName;
	private String  sAdd;
	

}
