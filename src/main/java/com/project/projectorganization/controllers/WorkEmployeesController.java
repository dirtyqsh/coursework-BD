package com.project.projectorganization.controllers;

import com.project.projectorganization.models.Client;
import com.project.projectorganization.models.WorkEmployee;
import com.project.projectorganization.repo.WorkEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkEmployeesController {

    @Autowired
    private WorkEmployeeRepository workEmployeeRepository;

    @GetMapping("/workemployees")
    public String workemployees(Model model){
        Iterable<WorkEmployee> workEmployees = workEmployeeRepository.findAll();
        model.addAttribute("workemployees", workEmployees);
        return "workemployees-main";
    }

}
