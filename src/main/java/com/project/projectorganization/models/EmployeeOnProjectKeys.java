package com.project.projectorganization.models;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeOnProjectKeys implements Serializable {

    private Integer id_employee;

    private Integer id_project;

    public EmployeeOnProjectKeys(Integer id_employee, Integer id_project) {
        this.id_employee = id_employee;
        this.id_project = id_project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeOnProjectKeys that = (EmployeeOnProjectKeys) o;
        return Objects.equals(id_employee, that.id_employee) && Objects.equals(id_project, that.id_project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_employee, id_project);
    }
}
