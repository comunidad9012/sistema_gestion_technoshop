/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.controller;

import com.practicas.OKSHOPSG.Modelo.ControllerInt;
import com.practicas.OKSHOPSG.Modelo.Proveedor;
import com.practicas.OKSHOPSG.Services.ProveedorServices;
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
 * @author CoreI5
 */
@Controller
@RequestMapping("/proveedores")
public class ProveedorController implements ControllerInt<Proveedor,String> {
    private final Logger logg = LoggerFactory.getLogger(Proveedor.class);
    
    @Autowired
    private ProveedorServices proveedorServices;
    
    @GetMapping("")
    @Override
    public String main(Model model) {
        model.addAttribute("proveedores",proveedorServices.select());
        return "proveedortmpl/proveedoresmain.html";
    }

    @GetMapping("/back")
    @Override
    public String back() {
        return "proveedortmpl/proveedoresmain.html";
    }
    
    @GetMapping("/altaproveedoresform")
    @Override
    public String altaform() {
        return "proveedortmpl/altaproveedores.html";
    }

    @PostMapping("/altaproveedores")
    @Override
    public String alta(Proveedor proveedor) {
        logg.info("Información del objeto proveedor, {}",proveedor);
        proveedorServices.alta(proveedor);
        return "redirect:/proveedores";
    }

    @GetMapping("/updateproveedoresform/{id}")
    @Override
    public String updateform(@PathVariable String id, Model model) {
        model.addAttribute("FUProveedores", proveedorServices.updateform(id));
        return "proveedortmpl/updateproveedores.html";
    }
    
    @PostMapping("/updateproveedores")
    @Override
    public String update(Proveedor proveedor) {
        logg.info("Información del objeto proveedor {}", proveedor);
        proveedorServices.update(proveedor);
        return "redirect:/proveedores";
    }
    
    @GetMapping("/deleteproveedores/{id}")
    @Override
    public String delete(@PathVariable String id) {
        proveedorServices.delete(id);
        return "redirect:/proveedores";
    }
    
    
}
