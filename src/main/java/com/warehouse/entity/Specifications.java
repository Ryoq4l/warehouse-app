package com.warehouse.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "specifications")
@IdClass(SpecificationID.class)
public class Specifications implements Serializable {

    @Id
    @Column(name = "ttnid")
    private Integer ttnId;

    @Id
    @Column(name = "productid")
    private Integer productId;

    @Column(name = "count")
    private Integer count;

    @Column(name = "price", precision = 6, scale = 2)
    private BigDecimal price;

    public Specifications() {
    }
}

