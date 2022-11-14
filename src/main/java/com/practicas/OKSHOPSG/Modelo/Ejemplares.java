/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author CoreI5
 */
@Entity
@Table(name="ejemplares")
public class Ejemplares {
    
    //@Id
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name="Producto.id", referencedColumnName = "id")
    //private Producto producto;
    
    //@Id
    //private int id_ejemplar;
    
    @EmbeddedId
    private EjemplaresID ejemplaresID;
    
    private boolean disponibilidad;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_proveedor", referencedColumnName = "cuit")
    private Proveedor proveedor;

    public Ejemplares() {
        super();
    }

    public Ejemplares(EjemplaresID id_ejemplar, boolean disponibilidad, Proveedor proveedor) {
        this.ejemplaresID = id_ejemplar;
        this.disponibilidad = disponibilidad;
        this.proveedor = proveedor;
    }

    public EjemplaresID getEjemplaresID() {
        return ejemplaresID;
    }

    public void setEjemplaresID(EjemplaresID ejemplaresID) {
        this.ejemplaresID = ejemplaresID;
    }
    
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Ejemplares{" + "id_ejemplar=" + ejemplaresID + ", disponibilidad=" + disponibilidad + ", proveedor=" + proveedor + '}';
    }
    
    
}
