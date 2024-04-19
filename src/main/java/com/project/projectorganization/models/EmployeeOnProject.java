package com.project.projectorganization.models;


import jakarta.persistence.*;

@Entity
@IdClass(EmployeeOnProject.class)
@Table(name = "Сотрудники_на_проекте")
public class EmployeeOnProject {

    @Id
    @Column(name = "Код_сотрудника")
    private Integer id_employee;

    @Id
    @Column(name = "Код_проекта")
    private Integer id_project;

    @ManyToOne
    @JoinColumn(name = "Код_сотрудника", referencedColumnName = "Код_сотрудника", insertable=false, updatable=false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "Код_проекта", referencedColumnName = "Код_проекта", insertable=false, updatable=false)
    private Project project;

    public Integer getId_employee() {
        return id_employee;
    }

    public void setId_employee(Integer id_employee) {
        this.id_employee = id_employee;
    }

    public Integer getId_project() {
        return id_project;
    }

    public void setId_project(Integer id_project) {
        this.id_project = id_project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
