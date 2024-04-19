package com.project.projectorganization.services;

import com.project.projectorganization.models.Project;
import com.project.projectorganization.repo.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getCompletedProjects() {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Преобразуем дату в Timestamp
        LocalDateTime startOfDay = currentDate.atStartOfDay();
        Timestamp completionDate = Timestamp.valueOf(startOfDay);

        // Выполняем запрос с использованием Timestamp
        List<Project> completedProjects = projectRepository.findCompletedProjects(completionDate);

        // Возвращаем результат
        return completedProjects;
    }

    public List<Project> getOngoingProjects() {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Преобразуем дату в Timestamp
        LocalDateTime startOfDay = currentDate.atStartOfDay();
        Timestamp completionDate = Timestamp.valueOf(startOfDay);

        // Выполняем запрос с использованием Timestamp
        List<Project> uncompletedProjects = projectRepository.findOngoingProjects(completionDate);

        // Возвращаем результат
        return uncompletedProjects;
    }

    public Project getProjectById(int projectId) {
        return projectRepository.findById(projectId);
    }
}
