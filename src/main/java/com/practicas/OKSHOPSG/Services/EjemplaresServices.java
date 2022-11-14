/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Services;

import com.practicas.OKSHOPSG.Modelo.ABM;
import com.practicas.OKSHOPSG.Modelo.Ejemplares;
import com.practicas.OKSHOPSG.Modelo.EjemplaresID;
import com.practicas.OKSHOPSG.Modelo.Producto;
import com.practicas.OKSHOPSG.repository.EjemplaresRepository;
import com.practicas.OKSHOPSG.repository.ProductoRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CoreI5
 */
@Service
public abstract class EjemplaresServices implements ABM<Ejemplares,EjemplaresID> {
    private final Logger logg = LoggerFactory.getLogger(Ejemplares.class);
    
    @Autowired
    private EjemplaresRepository ejemplaresRepository;
    
    /*@Autowired
    private ProductoRepository productoRepository;*/

    @Override
    public List<Ejemplares> select() {
        return ejemplaresRepository.findAll();
    }
    
    //Sin terminar
    /*public void alta(Ejemplares ejemplares, int cantidad, int id_producto) {
        Producto producto = productoRepository.getById(id_producto);
        EjemplaresID ejemplaresid = new EjemplaresID();
        ejemplaresid.setId_producto(producto);
        for (int i = 0; i < cantidad; i++) {
            int id_ejemplar = ejemplaresRepository.countById(id_producto);
            ejemplaresid.setId_ejemplar(id_ejemplar);
            ejemplares.setEjemplaresID(ejemplaresid);
        }
       
    }*/

    @Override
    public Ejemplares updateform(EjemplaresID e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Ejemplares t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(EjemplaresID e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
