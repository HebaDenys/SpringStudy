package com.hebadenysprojects.studyProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hebadenysprojects.studyProject.model.Employee;
import com.hebadenysprojects.studyProject.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteAll() {
        employeeRepository.deleteAll();
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}
