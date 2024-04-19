package com.project.projectorganization.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Оборудование")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_оборудования")
    private Integer id_equipment;

    @Column(name = "Наименование")
    private String name;

    @Column(name = "Код_отдела")
    private Integer numberDepartment;

    @ManyToOne
    @JoinColumn(name = "Код_отдела", referencedColumnName = "Код_отдела", insertable=false, updatable=false)
    private Department department;

    @OneToMany(mappedBy = "equipment")
    private List<EquipmentOnProject> equipmentOnProjects;

    public Integer getId_equipment() {
        return id_equipment;
    }

    public void setId_equipment(Integer id_equipment) {
        this.id_equipment = id_equipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(Integer numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<EquipmentOnProject> getEquipmentOnProjects() {
        return equipmentOnProjects;
    }

    public void setEquipmentOnProjects(List<EquipmentOnProject> equipmentOnProjects) {
        this.equipmentOnProjects = equipmentOnProjects;
    }
}
