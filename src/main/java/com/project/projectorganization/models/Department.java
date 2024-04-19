package com.project.projectorganization.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Отдел")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_отдела")
    private Integer id_department;

    @Column(name = "Начальник")
    private Integer head;

    @Column(name = "Наименование")
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Equipment> equipments;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Integer getId_department() {
        return id_department;
    }

    public void setId_department(Integer id_department) {
        this.id_department = id_department;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
