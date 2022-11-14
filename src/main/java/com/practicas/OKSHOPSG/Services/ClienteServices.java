/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.OKSHOPSG.Services;

import com.practicas.OKSHOPSG.Modelo.Cliente;
import com.practicas.OKSHOPSG.repository.ClienteRepository;
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
public class ClienteServices {
    private final Logger logg = LoggerFactory.getLogger(Cliente.class);
    
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> select() {
        return clienteRepository.findAll();
    }

    public void alta(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getDni()) == true) {
            logg.info("El cliente ya se encuentra en la base de datos");
        } else {
            clienteRepository.save(cliente);
        }
    }
    
    public Cliente updateform(String id){
        Cliente client = clienteRepository.getOne(id);
        logg.info("Objeto recuperado {}",client);
        return client;
    }
    
    public void update(Cliente cliente){
        clienteRepository.save(cliente);
    }
    
    public void delete(String id){
        Cliente client = clienteRepository.getOne(id);
        logg.info("Objeto eliminado {}",client);
        clienteRepository.delete(client);
    }
}
