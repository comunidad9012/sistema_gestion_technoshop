/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Services;

import com.practicas.OKSHOPSG.Modelo.ABM;
import com.practicas.OKSHOPSG.Modelo.Proveedor;
import com.practicas.OKSHOPSG.repository.ProveedorRepository;
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
public class ProveedorServices implements ABM<Proveedor,String> {
    
    private final Logger logg = LoggerFactory.getLogger(Proveedor.class);
    
    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> select() {
        return proveedorRepository.findAll();
    }

    @Override
    public void alta(Proveedor proveedor) {
        if (proveedorRepository.existsById(proveedor.getCuit()) == true) {
            logg.info("El proveedor ya se encuentra en la base de datos");
        } else{
            proveedorRepository.save(proveedor);
        }
    }

    @Override
    public Proveedor updateform(String id) {
        Proveedor proveedor = proveedorRepository.getById(id);
        logg.info("Objeto recuperado {}", proveedor);
        return proveedor;
    }

    @Override
    public void update(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }

    @Override
    public void delete(String id) {
        Proveedor proveedor = proveedorRepository.getById(id);
        logg.info("Objeto recuperado {}", proveedor);
        proveedorRepository.delete(proveedor);
    }
    
}
