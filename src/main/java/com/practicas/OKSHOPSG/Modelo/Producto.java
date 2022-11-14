/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CoreI5
 */
@Entity
@Table (name="productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String marca;
    private int nro_ejemplares = 0;
    private String categoria;
    
    
    public Producto() {
        super();
    }

    public Producto(int id, String nombre, int nro_ejemplares, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.nro_ejemplares = nro_ejemplares;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNro_ejemplares() {
        return nro_ejemplares;
    }

    public void setNro_ejemplares(int nro_ejemplares) {
        this.nro_ejemplares = nro_ejemplares;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", nro_ejemplares=" + nro_ejemplares + ", categoria=" + categoria + '}';
    }
    
}
