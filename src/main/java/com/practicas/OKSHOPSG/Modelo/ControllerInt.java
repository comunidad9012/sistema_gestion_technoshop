/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicas.OKSHOPSG.Modelo;

import org.springframework.ui.Model;

/**
 *
 * @author CoreI5
 */
public interface ControllerInt<T,E>  {
    String main(Model model);
    String back();
    String altaform();
    String alta(T t);
    String updateform(E e, Model model);
    String update(T t);
    String delete(E e);
    
}
