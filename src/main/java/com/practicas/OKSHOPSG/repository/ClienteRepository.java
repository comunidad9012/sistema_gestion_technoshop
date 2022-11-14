/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicas.OKSHOPSG.repository;

import com.practicas.OKSHOPSG.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CoreI5
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String>{
    
}
