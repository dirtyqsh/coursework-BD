package com.project.projectorganization.services;

import com.project.projectorganization.models.Employee;
import com.project.projectorganization.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> getEmployeesByDepartmentId(Integer departmentId) {
        return employeeRepository.findEmployeesByDepartmentId(departmentId);
    }
}
