package com.warehouse.entity;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientid")
    private Integer clientId;

    @Column(name = "clientname")
    private String clientName;

    @Column(name = "type")
    private Integer type;

    // Геттеры и сеттеры
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public Integer getType() {
        return type;
    }
}