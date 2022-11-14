/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicas.OKSHOPSG.repository;

import com.practicas.OKSHOPSG.Modelo.Proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CoreI5
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, String> {
    
}
