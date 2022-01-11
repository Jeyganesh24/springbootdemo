package com.chainsys.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Department {
	
	public Department() {
		System.out.println("Dept Called Using autowire");
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deptId;
	@ApiModelProperty(notes = "departmentName",name = "deptName")
	private String deptName;
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
