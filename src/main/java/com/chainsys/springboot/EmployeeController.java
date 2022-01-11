package com.chainsys.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public String createEmployee(@RequestBody Employee employee) {
	String empName=	employeeService.creatEmployee(employee);
	return "Employee created Successfully"+empName;
	}
	
	@GetMapping("/getEmp/{empId}")
public String getEmployee(@PathVariable String empId)	{
	String empName=employeeService.getEmployee(empId);
	return "Employee getting Successfully"+empName;
}

}
