package com.project.projectorganization.repo;

import com.project.projectorganization.models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
