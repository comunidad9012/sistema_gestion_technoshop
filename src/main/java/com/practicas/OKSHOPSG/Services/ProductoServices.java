/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Services;

import com.practicas.OKSHOPSG.Modelo.ABM;
import com.practicas.OKSHOPSG.Modelo.Producto;
import com.practicas.OKSHOPSG.repository.ProductoRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alumno
 */
@Service
public class ProductoServices implements ABM<Producto,Integer> {
    private final Logger logg = LoggerFactory.getLogger(Producto.class);
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> select() {
        return productoRepository.findAll();
    }

    @Override
    public void alta(Producto producto) {
        if (productoRepository.existsById(producto.getId())==true) {
            logg.info("El producto ya existe en la base de datos");
        } else {
            productoRepository.save(producto);
        }
    }

    @Override
    public Producto updateform(Integer id) {
        Producto producto = productoRepository.getById(id);
        logg.info("Objeto recuperado {}",producto);
        return producto;
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        Producto producto = productoRepository.getById(id);
        logg.info("Objeto recuperado {}", producto);
        productoRepository.delete(producto);
    }
}
