package com.project.projectorganization.controllers;

import com.project.projectorganization.models.Department;
import com.project.projectorganization.models.Employee;
import com.project.projectorganization.repo.DepartmentRepository;
import com.project.projectorganization.services.DepartmentService;
import com.project.projectorganization.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collections;
import java.util.List;

@Controller
public class DepartmentsController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/departments")
    public String departments(Model model){
        Iterable<Department> departments = departmentRepository.findAll();
        model.addAttribute("departments", departments);
        return "departments-main";
    }
}
