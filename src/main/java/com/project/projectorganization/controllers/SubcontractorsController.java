package com.project.projectorganization.controllers;


import com.project.projectorganization.models.Project;
import com.project.projectorganization.models.Subcontractor;
import com.project.projectorganization.repo.SubcontractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubcontractorsController {

    @Autowired
    private SubcontractorRepository subcontractorRepository;

    @GetMapping("/subcontractors")
    public String subcontractors(Model model){
        Iterable<Subcontractor> subcontractors = subcontractorRepository.findAll();
        model.addAttribute("subcontractors", subcontractors);
        return "subcontractors-main";
    }
}
