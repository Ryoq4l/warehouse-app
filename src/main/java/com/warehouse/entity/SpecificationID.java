package com.warehouse.entity;

import java.io.Serializable;
import java.util.Objects;

public class SpecificationID implements Serializable {

    private Integer ttnId;
    private Integer productId;

    public SpecificationID() {}

    public SpecificationID(Integer ttnId, Integer productId) {
        this.ttnId = ttnId;
        this.productId = productId;
    }

    public Integer getTtnId() {
        return ttnId;
    }

    public void setTtnId(Integer ttnId) {
        this.ttnId = ttnId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }


}