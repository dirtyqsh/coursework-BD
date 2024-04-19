package com.project.projectorganization.models;

import java.io.Serializable;
import java.util.Objects;

public class EquipmentOnProjectKeys implements Serializable {

    private Integer id_equipment;

    private Integer id_project;

    public EquipmentOnProjectKeys(Integer id_equipment, Integer id_project) {
        this.id_equipment = id_equipment;
        this.id_project = id_project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentOnProjectKeys that = (EquipmentOnProjectKeys) o;
        return Objects.equals(id_equipment, that.id_equipment) && Objects.equals(id_project, that.id_project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_equipment, id_project);
    }
}
