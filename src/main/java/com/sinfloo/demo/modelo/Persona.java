
package com.sinfloo.demo.modelo;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
    
@Entity
@Table(name = "persona")

public class Persona {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;
    @Getter @Setter @Column(name = "name")
    private String name;    
    @Getter @Setter @Column(name = "phone")
    private String phone;
    
    public Persona(){
        
    }
    
}
