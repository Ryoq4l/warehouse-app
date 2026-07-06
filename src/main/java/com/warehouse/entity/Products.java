package com.warehouse.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table (name = "products")
public class Products implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "productid")
    private long productid;

    @Column (name = "productname", nullable = false, length = 50)
    private String productname;

    public Products () {}

    public Products (long productid, String productname) {
       this.productid = productid;
       this.productname = productname;
    }
public long getProductid (){
        return productid;
}
public String getProductname(){
        return productname;
}
public void setProductname(String productname){
        this.productname = productname;
}
}
