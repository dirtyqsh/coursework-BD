package com.project.projectorganization.controllers;

import com.project.projectorganization.models.Project;
import com.project.projectorganization.models.WorkEmployee;
import com.project.projectorganization.models.WorkSubcontractor;
import com.project.projectorganization.repo.ProjectRepository;
import com.project.projectorganization.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProjectsController {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectService projectService;


    @GetMapping("/projects")
    public String projects(Model model){
        Iterable<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "projects-main";
    }

    @GetMapping("/projects/{projectId}")
    public String viewProject(@PathVariable int projectId, Model model) {
        Project project = projectService.getProjectById(projectId);
        model.addAttribute("project", project);
        return "project-details";
    }


}
