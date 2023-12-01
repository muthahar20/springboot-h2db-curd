package com.mtr.springbooth2dbcurd.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mtr.springbooth2dbcurd.entity.Department;

@Component
public interface DepartmentService {
	
	//Save Operation
	Department saveDepartment(Department department);
	
	// Read operation
    List<Department> fetchDepartmentList();
 
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);

}
