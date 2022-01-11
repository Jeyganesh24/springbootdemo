package com.chainsys.springboot;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/student")
@Api(value = "Department Rest Controller", description = "REST API for Department")

public class DemoController {

@Autowired
DepartmentRepository departmentRepository;
	
	
/*
 * @GetMapping("/getStudent/{stdId}")
 * 
 * @ApiOperation(value = "Get Users ", response = String.class, tags =
 * "getUsers")
 * 
 * @ApiResponses(value = {
 * 
 * @ApiResponse(code = 200, message = "Success|OK"),
 * 
 * @ApiResponse(code = 401, message = "Not Authorized!"),
 * 
 * @ApiResponse(code = 403, message = "Forbidden!"),
 * 
 * @ApiResponse(code = 404, message = "Not Found!") }) public String
 * getStudent(@PathVariable String stdId) {
 * //configurableEnvironment.setActiveProfiles("") return "Jey"; }
 */
	
@ApiOperation(value = "Get Departments ", response = String.class, tags ="getDepartment")
 
 @ApiResponses(value = {
 
 @ApiResponse(code = 200, message = "Success|OK"),
 
 @ApiResponse(code = 401, message = "Not Authorized!"),
 
 @ApiResponse(code = 403, message = "Forbidden!"),
 
 @ApiResponse(code = 404, message = "Not Found!") })
	@GetMapping("/getStudent/{deptId}")
	public String getStudent(@PathVariable String deptId ) {
		//configurableEnvironment.setActiveProfiles("")
		Optional<Department> department2= departmentRepository.findById(Long.parseLong(deptId));
	  return "Department getting successfully for " +department2.get().getDeptName();
	 }
	@DeleteMapping("/deleteStudent")
	public String deleteDepartment(@RequestBody Department department) {
		//configurableEnvironment.setActiveProfiles("")
	  return "Jey";
	 }
	
		/*
		 * @PostMapping("/save") public String createDepartment(@RequestBody Department
		 * department) { departmentRepository.save(department); return "Jey"; }
		 */
	
	@ApiOperation(value = "Post Departments ", response = String.class, tags ="createDepartment")
	 
	 @ApiResponses(value = {
	 
	 @ApiResponse(code = 200, message = "Success|OK"),
	 
	 @ApiResponse(code = 401, message = "Not Authorized!"),
	 
	 @ApiResponse(code = 403, message = "Forbidden!"),
	 
	 @ApiResponse(code = 404, message = "Not Found!") })
	@PostMapping("/save")
	public String createDepartment(@RequestBody Department department) {
		Department department2= departmentRepository.save(department);
		return "Dept created successfully for " + department2.getDeptName();
	}
	
	
	@PutMapping("/update")
	public String updateDepartment(@RequestBody Department department) {
		Department department2= departmentRepository.save(department);
		return "Dept created successfully for " + department2.getDeptName();
	}
	
}
