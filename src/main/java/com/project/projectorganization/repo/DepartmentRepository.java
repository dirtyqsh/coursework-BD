package com.project.projectorganization.repo;

import com.project.projectorganization.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
