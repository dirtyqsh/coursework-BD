package com.project.projectorganization.controllers;

import com.project.projectorganization.models.WorkEmployee;
import com.project.projectorganization.models.WorkSubcontractor;
import com.project.projectorganization.repo.WorkSubcontractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkSubcontractorsController {

    @Autowired
    private WorkSubcontractorRepository workSubcontractorRepository;

    @GetMapping("/worksubcontractors")
    public String worksubcontractors(Model model){
        Iterable<WorkSubcontractor> workSubcontractors = workSubcontractorRepository.findAll();
        model.addAttribute("worksubcontractors", workSubcontractors);
        return "worksubcontractors-main";
    }
}
