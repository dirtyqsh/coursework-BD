package com.project.projectorganization.repo;

import com.project.projectorganization.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    @Query("SELECT p FROM Project p WHERE p.date_two <= :currentDate")
    List<Project> findCompletedProjects(@Param("currentDate") Timestamp currentDate);

    @Query("SELECT p FROM Project p WHERE p.date_one <= :currentDate AND p.date_two >= :currentDate")
    List<Project> findOngoingProjects(@Param("currentDate") Timestamp currentDate);

    Project findById(int id);
}
