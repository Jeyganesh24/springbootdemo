package com.chainsys.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public String creatEmployee(Employee employee) {
	Employee employee2=	employeeRepo.save(employee);
		return employee2.getEmpName();
		
	}
	
	public String getEmployee(String empId) {
		Optional<Employee> employee2=	employeeRepo.findById(Long.parseLong(empId));
			return employee2.get().getEmpName();
			
		}

}
