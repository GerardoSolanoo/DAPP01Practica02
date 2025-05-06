/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DAPP01Practica02;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author sgerardov
 */
@Entity
@Table(name = "departamentos")
public class Departamento implements Serializable{
    @Id
    @GeneratedValue(generator = "departamentos_clave_seq",
            strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "departamentos_clave_seq",
            sequenceName = "departamentos_clave_seq", initialValue = 1,
            allocationSize = 1)
    
    @Column
    private Long clave;
    
    @Column
    private String nombre;

    public Long getClave() {
        return clave;
    }

    public void setClave(Long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
