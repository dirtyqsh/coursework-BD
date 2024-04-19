package com.project.projectorganization.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Клиент")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Код_клиента")
    private Integer id_client;

    @Column(name = "Заказчик")
    private String customer;

    @Column(name = "Страна")
    private String country;

    @Column(name = "Адрес")
    private String adress;

    @Column(name = "Телефон")
    private String phone;

    @OneToMany(mappedBy = "client")
    private List<Contract> contracts;

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

}
