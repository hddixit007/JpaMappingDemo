package com.jpaMap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jpaMap.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
