package com.project.projectorganization.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@IdClass(WorkSubcontractorKeys.class)
@Table(name = "Работа_субподрядчика")
public class WorkSubcontractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_работы")
    private Integer id_worksubcontractor;

    @Id
    @Column(name = "Код_проекта")
    private Integer id_project;

    @Id
    @Column(name = "Код_субподрядчика")
    private Integer id_subcontractor;

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
    @JoinColumn(name = "Код_субподрядчика", referencedColumnName = "Код_субподрядчика", insertable=false, updatable=false)
    private Subcontractor subcontractor;

    @ManyToOne
    @JoinColumn(name = "Код_проекта", referencedColumnName = "Код_проекта", insertable=false, updatable=false)
    private Project project;

    public Integer getId_worksubcontractor() {
        return id_worksubcontractor;
    }

    public void setId_worksubcontractor(Integer id_worksubcontractor) {
        this.id_worksubcontractor = id_worksubcontractor;
    }

    public Integer getId_project() {
        return id_project;
    }

    public void setId_project(Integer id_project) {
        this.id_project = id_project;
    }

    public Integer getId_subcontractor() {
        return id_subcontractor;
    }

    public void setId_subcontractor(Integer id_subcontractor) {
        this.id_subcontractor = id_subcontractor;
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

    public Subcontractor getSubcontractor() {
        return subcontractor;
    }

    public void setSubcontractor(Subcontractor subcontractor) {
        this.subcontractor = subcontractor;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
