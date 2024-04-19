package com.project.projectorganization.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Субподрядчик")
public class Subcontractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_субподрядчика")
    private Integer id_subcontractor;

    @Column(name = "Исполнитель")
    private String name;

    @Column(name = "Страна")
    private String country;

    @Column(name = "Адрес")
    private String adress;

    @Column(name = "Телефон")
    private String phone;

    @OneToMany(mappedBy = "subcontractor")
    private List<WorkSubcontractor> workSubcontractors;

    public Integer getId_subcontractor() {
        return id_subcontractor;
    }

    public void setId_subcontractor(Integer id_subcontractor) {
        this.id_subcontractor = id_subcontractor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<WorkSubcontractor> getWorkSubcontractors() {
        return workSubcontractors;
    }

    public void setWorkSubcontractors(List<WorkSubcontractor> workSubcontractors) {
        this.workSubcontractors = workSubcontractors;
    }
}
