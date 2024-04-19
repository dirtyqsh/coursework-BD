package com.project.projectorganization.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Договор")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_договора")
    private Integer id_contract;

    @Column(name = "Код_клиента")
    private Integer id_client;

    @Column(name = "Дата_подписания")
    private Date date_ok;

    @OneToMany(mappedBy = "contract")
    private List<Project> projects;

    @ManyToOne
    @JoinColumn(name = "Код_клиента", referencedColumnName = "Код_клиента", insertable=false, updatable=false)
    private Client client;

    public Integer getId_contract() {
        return id_contract;
    }

    public void setId_contract(Integer id_contract) {
        this.id_contract = id_contract;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Date getDate_ok() {
        return date_ok;
    }

    public void setDate_ok(Date date_ok) {
        this.date_ok = date_ok;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
