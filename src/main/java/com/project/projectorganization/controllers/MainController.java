package com.project.projectorganization.controllers;

import com.project.projectorganization.models.Project;
import com.project.projectorganization.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String home(Model model){
        List<Project> completedProjects = projectService.getCompletedProjects();
        List<Project> ongoingProjects = projectService.getOngoingProjects();

        model.addAttribute("completedProjects", completedProjects);
        model.addAttribute("ongoingProjects", ongoingProjects);
        return "home";
    }

}
