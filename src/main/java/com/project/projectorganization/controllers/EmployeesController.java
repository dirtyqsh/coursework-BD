package com.project.projectorganization.controllers;


import com.project.projectorganization.models.Employee;
import com.project.projectorganization.repo.EmployeeRepository;
import com.project.projectorganization.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String employees(Model model){
        Iterable<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employees-main";
    }

    @GetMapping("/employees/{departmentId}")
    public String getEmployeesByDepartmentId(@PathVariable Integer departmentId, Model model) {
        List<Employee> employees = employeeService.getEmployeesByDepartmentId(departmentId);
        model.addAttribute("employeedep", employees);
        return "department-info"; // Замените на имя вашего представления
    }

    @GetMapping("/employee/{id}")
    public String getEmployeeInfo(@PathVariable Integer id, Model model) {
        // Получите информацию о сотруднике по id и добавьте в модель
        Optional<Employee> employeeOptional = employeeService.getEmployeeById(id);
        Employee employee = employeeOptional.orElse(null);
        model.addAttribute("employee", employee);
        return "employee-info"; // Имя представления для отображения информации о сотруднике
    }
}
