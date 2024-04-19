package com.project.projectorganization.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Проект")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_проекта")
    private Integer id_project;

    @Column(name = "Код_договора")
    private Integer id_contract;

    @Column(name = "Название")
    private String name;

    @Column(name = "Стоимость")
    private Float cost;

    @Column(name = "Дата_начала")
    private Date date_one;

    @Column(name = "Дата_окончания")
    private Date date_two;

    @Column(name = "Статус")
    private Boolean status;

    @Column(name = "Руководитель")
    private Integer header;

    @ManyToOne
    @JoinColumn(name = "Руководитель", referencedColumnName = "Код_сотрудника", insertable=false, updatable=false)
    private Employee employee;

    @OneToMany(mappedBy = "project")
    private List<EmployeeOnProject> employeeOnProjects;

    @ManyToOne
    @JoinColumn(name = "Код_договора", referencedColumnName = "Код_договора", insertable=false, updatable=false)
    private Contract contract;

    @OneToMany(mappedBy = "project")
    private List<WorkSubcontractor> workSubcontractors;

    @OneToMany(mappedBy = "project")
    private List<WorkEmployee> workEmployees;

    public Integer getId_project() {
        return id_project;
    }

    public void setId_project(Integer id_project) {
        this.id_project = id_project;
    }

    public Integer getId_contract() {
        return id_contract;
    }

    public void setId_contract(Integer id_contract) {
        this.id_contract = id_contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getHeader() {
        return header;
    }

    public void setHeader(Integer header) {
        this.header = header;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<EmployeeOnProject> getEmployeeOnProjects() {
        return employeeOnProjects;
    }

    public void setEmployeeOnProjects(List<EmployeeOnProject> employeeOnProjects) {
        this.employeeOnProjects = employeeOnProjects;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<WorkSubcontractor> getWorkSubcontractors() {
        return workSubcontractors;
    }

    public void setWorkSubcontractors(List<WorkSubcontractor> workSubcontractors) {
        this.workSubcontractors = workSubcontractors;
    }

    public List<WorkEmployee> getWorkEmployees() {
        return workEmployees;
    }

    public void setWorkEmployees(List<WorkEmployee> workEmployees) {
        this.workEmployees = workEmployees;
    }
}
