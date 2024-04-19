package com.project.projectorganization.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Сотрудники")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_сотрудника")
    private Integer id_employee;

    @Column(name = "Код_отдела")
    private Integer numberDepartment;

    @Column(name = "ФИО")
    private String fio;

    @Column(name = "Дата_рождения")
    private Date date;

    @Column(name = "Номер_телефона")
    private String phone;

    @Column(name = "Адрес")
    private String adress;

    @Column(name = "Должность")
    private String post;

    @ManyToOne
    @JoinColumn(name = "Код_отдела", referencedColumnName = "Код_отдела", insertable=false, updatable=false)
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Project> projects;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeOnProject> employeeOnProjects;

    @OneToMany(mappedBy = "employee")
    private List<WorkEmployee>  workEmployee;

    public Integer getId_employee() {
        return id_employee;
    }

    public void setId_employee(Integer id_employee) {
        this.id_employee = id_employee;
    }

    public Integer getNumberDepartment() {
        return numberDepartment;
    }

    public void setNumberDepartment(Integer numberDepartment) {
        this.numberDepartment = numberDepartment;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<EmployeeOnProject> getEmployeeOnProjects() {
        return employeeOnProjects;
    }

    public void setEmployeeOnProjects(List<EmployeeOnProject> employeeOnProjects) {
        this.employeeOnProjects = employeeOnProjects;
    }

    public List<WorkEmployee> getWorkEmployee() {
        return workEmployee;
    }

    public void setWorkEmployee(List<WorkEmployee> workEmployee) {
        this.workEmployee = workEmployee;
    }
}
