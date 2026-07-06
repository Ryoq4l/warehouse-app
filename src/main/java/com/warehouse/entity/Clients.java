package com.warehouse.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "clients")
public class Clients implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "clientid")
    private long clientId;

    @Column (name = "clientname", nullable = false, length = 50)
    private String clientname;

    @Column (name = "type", nullable = false)
    private short type;

    public Clients () {

    }

    public Clients (long clientId, String clientname, short type) {
        this.clientId = clientId;
        this.clientname = clientname;
        this.type = type;
    }

    public long getClientId () {
        return clientId;
    }
    public String getClientname() {
        return clientname;
    }
    public short getType() {
        return type;
    }
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
    public void setType(short type) {
        this.type = type;
    }

}
