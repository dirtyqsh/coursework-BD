package com.project.projectorganization.models;

import java.io.Serializable;
import java.util.Objects;

public class WorkSubcontractorKeys implements Serializable {

    private Integer id_project;

    private Integer id_subcontractor;

    private Integer id_worksubcontractor;

    public WorkSubcontractorKeys() {
    }

    public WorkSubcontractorKeys(Integer id_project, Integer id_subcontractor, Integer id_worksubcontractor) {
        this.id_project = id_project;
        this.id_subcontractor = id_subcontractor;
        this.id_worksubcontractor = id_worksubcontractor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSubcontractorKeys that = (WorkSubcontractorKeys) o;
        return Objects.equals(id_project, that.id_project) && Objects.equals(id_subcontractor, that.id_subcontractor) && Objects.equals(id_worksubcontractor, that.id_worksubcontractor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_project, id_subcontractor, id_worksubcontractor);
    }
}
