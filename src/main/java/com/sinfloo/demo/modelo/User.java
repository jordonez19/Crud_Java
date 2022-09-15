
package com.sinfloo.demo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
    
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "dni")
    private String dni;
    @Getter @Setter @Column(name = "placa")
    private String placa;
    @Getter @Setter @Column(name = "vehiculo")
    private String vehiculo;
    @Getter @Setter @Column(name = "tiempo")
    private String tiempo;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id")
    private Factura fId;


    public User(){
        
    }
    
}
