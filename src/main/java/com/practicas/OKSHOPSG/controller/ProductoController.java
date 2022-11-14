/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.controller;

import com.practicas.OKSHOPSG.Modelo.ControllerInt;
import com.practicas.OKSHOPSG.Modelo.Producto;
import com.practicas.OKSHOPSG.Services.ProductoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alumno
 */
@Controller
@RequestMapping("/productos")
public class ProductoController implements ControllerInt<Producto,Integer> {
    private final Logger logg = LoggerFactory.getLogger(Producto.class);
    
    @Autowired
    private ProductoServices productoServices;

    @GetMapping("")
    @Override
    public String main(Model model) {
        model.addAttribute("productos", productoServices.select());
        return "productotmpl/productosmain.html";
    }
    
    @GetMapping("/back")
    @Override
    public String back() {
        return "productotmpl/productosmain.html";
    }

    @GetMapping("/altaproductoform")
    @Override
    public String altaform() {
        return "productotmpl/altaproductos.html";
    }

    @PostMapping("/altaproducto")
    @Override
    public String alta(Producto producto) {
        logg.info("Información del objeto producto {}", producto);
        productoServices.alta(producto);
        return "redirect:/productos";
    }
    
    @GetMapping("/updateproductosform/{id}")
    @Override
    public String updateform(@PathVariable Integer id, Model model) {
        model.addAttribute("FUProducto", productoServices.updateform(id));
        return "productotmpl/updateproductos.html";
    }

    @PostMapping("/updateproductos")
    @Override
    public String update(Producto producto) {
        logg.info("Información del objeto producto {}", producto);
        productoServices.update(producto);
        return "redirect:/productos";
    }

    @GetMapping("/deleteproductos/{id}")
    @Override
    public String delete(@PathVariable Integer id) {
        productoServices.delete(id);
        return "redirect:/productos";
    }
    
    
}
