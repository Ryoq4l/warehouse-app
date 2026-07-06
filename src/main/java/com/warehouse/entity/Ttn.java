package com.warehouse.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "ttns")
public class Ttn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ttnid")
    private Integer ttnId;

    @Column(name = "ttnnumber", nullable = false, length = 10)
    private String ttnNumber;

    @Column(name = "ttndate")
    private LocalDate ttnDate;

    @Column(name = "senderid")
    private Integer senderId;

    @Column(name = "receiverid")
    private Integer receiverId;

    public Ttn() {}

    // Конструктор, геттеры и сеттеры
    public Integer getTtnId() {
        return ttnId;
    }

    public void setTtnId(Integer ttnId) {
        this.ttnId = ttnId;
    }

    public String getTtnNumber() {
        return ttnNumber;
    }

    public void setTtnNumber(String ttnNumber) {
        this.ttnNumber = ttnNumber;
    }

    public LocalDate getTtnDate() {
        return ttnDate;
    }

    public void setTtnDate(LocalDate ttnDate) {
        this.ttnDate = ttnDate;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }
}