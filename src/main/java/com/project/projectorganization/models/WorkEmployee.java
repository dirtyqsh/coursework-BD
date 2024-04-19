package com.project.projectorganization.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Работа_сотрудника")
public class WorkEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_работы")
    private Integer id_workemployee;

    @Column(name = "Код_проекта")
    private Integer id_project;

    @Column(name = "Код_сотрудника")
    private Integer id_employee;

    @Column(name = "Название")
    private String workname;

    @Column(name = "Стоимость")
    private Float cost;

    @Column(name = "Дата_начала")
    private Date date_one;

    @Column(name = "Дата_окончания")
    private Date date_two;

    @Column(name = "Статус")
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "Код_сотрудника", referencedColumnName = "Код_сотрудника", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "Код_проекта", referencedColumnName = "Код_проекта", insertable=false, updatable=false)
    private Project project;

    public Integer getId_workemployee() {
        return id_workemployee;
    }

    public void setId_workemployee(Integer id_workemployee) {
        this.id_workemployee = id_workemployee;
    }

    public Integer getId_project() {
        return id_project;
    }

    public void setId_project(Integer id_project) {
        this.id_project = id_project;
    }

    public Integer getId_employee() {
        return id_employee;
    }

    public void setId_employee(Integer id_employee) {
        this.id_employee = id_employee;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Date getDate_one() {
        return date_one;
    }

    public void setDate_one(Date date_one) {
        this.date_one = date_one;
    }

    public Date getDate_two() {
        return date_two;
    }

    public void setDate_two(Date date_two) {
        this.date_two = date_two;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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
