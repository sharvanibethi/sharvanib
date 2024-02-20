package org.acme;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;


import java.util.Date;


@Entity

public class Bike extends PanacheEntity {



    @Column(name="name")

    public String name;


    @Column(name="warranty_status")

    public String warranty_status;


    @Column(name="model")


    public String model;


    @Column(name="price")

    public int price;


    @Column(name="date_created")

    public Date date_created;

}