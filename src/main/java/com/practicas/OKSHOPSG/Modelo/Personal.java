/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alumno
 */
@Entity
@Table(name = "personal")
public class Personal {
    @Id
    @Column(length = 8)
    private String dni;
    private String nombre;
    private String telefono;
    private String contrasena;

    public Personal() {
    }

    public Personal(String dni, String nombre, String telefono, String contrasena) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Personal{" + "dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", contrasena=" + contrasena + '}';
    }
    
}
