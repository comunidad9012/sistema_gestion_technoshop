/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.controller;

import com.practicas.OKSHOPSG.Modelo.Cliente;
import com.practicas.OKSHOPSG.Services.ClienteServices;
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
@RequestMapping("/clientes")
public class ClienteController {
    
    private final Logger logg = LoggerFactory.getLogger(Cliente.class);
    
    @Autowired
    private ClienteServices clienteServices;
    
    @GetMapping("")
    public String clientes(Model model){
        model.addAttribute("clientes", clienteServices.select());
        return "clientestmpl/clientesmain.html";
    }
    
    @GetMapping("/back")
    public String back(){
        return "clientestmpl/clientesmain.html";
    }
    
    @GetMapping("/altaclientesform")
    public String altaform(){
        return "clientestmpl/altaclientes.html";
    }
    
    @PostMapping("/altacliente")
    public String alta(Cliente cliente){
        logg.info("Información del objeto cliente, {}",cliente);
        clienteServices.alta(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/updateclienteform/{id}")
    public String updateform(@PathVariable String id, Model model){
        model.addAttribute("FUCliente",clienteServices.updateform(id));
        return "clientestmpl/updatecliente.html";
    }
   
    @PostMapping("/updatecliente")
    public String update(Cliente cliente) {
        logg.info("Información del objeto cliente {}", cliente);
        clienteServices.update(cliente);
        return "redirect:/clientes";
    }
    
    @GetMapping("/deletecliente/{id}")
    public String delete(@PathVariable String id){
        clienteServices.delete(id);
        return "redirect:/clientes";
    }
}
