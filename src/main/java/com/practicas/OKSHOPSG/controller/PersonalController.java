/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.controller;

import com.practicas.OKSHOPSG.Modelo.Personal;
import com.practicas.OKSHOPSG.Services.PersonalServices;
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
@RequestMapping("/personal")
public class PersonalController {
    private final Logger logg = LoggerFactory.getLogger(Personal.class);
     
    @Autowired
    private PersonalServices personalServices;
    
    @GetMapping("")
    public String clientes(Model model){
        model.addAttribute("personal", personalServices.select());
        return "personaltmpl/personalmain.html";
    }
    
    @GetMapping("/back")
    public String back(){
        return "personaltmpl/personalmain.html";
    }
    
    @GetMapping("/altapersonalform")
    public String altaform(){
        return "personaltmpl/altapersonal.html";
    }
    
    @PostMapping("/altapersonal")
    public String alta(Personal personal){
        logg.info("Información del objeto cliente, {}",personal);
        personalServices.alta(personal);
        return "redirect:/personal";
    }
    
    @GetMapping("/updatepersonalform/{id}")
    public String updateform(@PathVariable String id, Model model){
        model.addAttribute("FUPersonal",personalServices.updateform(id));
        return "personaltmpl/updatepersonal.html";
    }
   
    @PostMapping("/updatepersonal")
    public String update(Personal personal) {
        logg.info("Información del objeto cliente {}", personal);
        personalServices.update(personal);
        return "redirect:/personal";
    }
    
    @GetMapping("/deletepersonal/{id}")
    public String delete(@PathVariable String id){
        personalServices.delete(id);
        return "redirect:/personal";
    }
}
