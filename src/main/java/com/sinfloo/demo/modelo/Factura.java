package com.sinfloo.demo.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "user_id")
    private String user_id;
    @Getter @Setter @Column(name = "total")
    private String total;

    @OneToOne(mappedBy = "id")
    private User uId;
}


