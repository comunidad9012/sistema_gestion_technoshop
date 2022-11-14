/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Services;

import com.practicas.OKSHOPSG.Modelo.Personal;
import com.practicas.OKSHOPSG.repository.PersonalRepository;
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
public class PersonalServices {
    private final Logger logg = LoggerFactory.getLogger(Personal.class);
    
    @Autowired
    private PersonalRepository personalRepository;
    
    public List<Personal> select(){
        return personalRepository.findAll();
    }
    
    public void alta(Personal personal){
        if (personalRepository.existsById(personal.getDni()) == true) {
            logg.info("El personal ya se encuentra en la base de datos");
        } else {
            personalRepository.save(personal);
        }
    }
    
    public Personal updateform(String id){
        Personal personal = personalRepository.getOne(id);
        logg.info("Objeto recuperado {}",personal);
        return personal;
    }
    
    public void update(Personal personal){
        personalRepository.save(personal);
    }
    
    public void delete (String id){
        Personal personal = personalRepository.getById(id);
        logg.info("Objeto eliminado {}",personal);
        personalRepository.delete(personal);
    }
}
