package com.project.projectorganization.models;


import jakarta.persistence.*;

@Entity
@IdClass(EquipmentOnProjectKeys.class)
@Table(name = "Оборудование_на_проекте")
public class EquipmentOnProject {

    @Id
    @Column(name = "Код_оборудования")
    private Integer id_equipment;

    @Id
    @Column(name = "Код_проекта")
    private Integer id_project;

    @ManyToOne
    @JoinColumn(name = "Код_оборудования", referencedColumnName = "Код_оборудования", insertable=false, updatable=false)
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "Код_проекта", referencedColumnName = "Код_проекта", insertable=false, updatable=false)
    private Project project;

    public Integer getId_equipment() {
        return id_equipment;
    }

    public void setId_equipment(Integer id_equipment) {
        this.id_equipment = id_equipment;
    }

    public Integer getId_project() {
        return id_project;
    }

    public void setId_project(Integer id_project) {
        this.id_project = id_project;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    //getter+setter
}
