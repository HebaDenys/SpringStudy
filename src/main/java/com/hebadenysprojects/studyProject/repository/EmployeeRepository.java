package com.hebadenysprojects.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hebadenysprojects.studyProject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
