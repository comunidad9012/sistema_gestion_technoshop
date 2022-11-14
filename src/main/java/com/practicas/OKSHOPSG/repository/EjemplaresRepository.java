/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicas.OKSHOPSG.repository;

import com.practicas.OKSHOPSG.Modelo.Ejemplares;
import com.practicas.OKSHOPSG.Modelo.EjemplaresID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CoreI5
 */
@Repository
public interface EjemplaresRepository extends JpaRepository<Ejemplares,EjemplaresID>{
    @Query(value="SELECT COUNT(*) FROM okshop.productos WHERE id = ?1;")
    Integer countById(int id);
}
