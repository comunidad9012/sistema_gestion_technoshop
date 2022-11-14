/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practicas.OKSHOPSG.Modelo;

import java.util.List;

/**
 *
 * @author CoreI5
 */
public interface ABM<T,E> {
   List<T> select();
   void alta(T t);
   T updateform(E e);
   void update(T t);
   void delete(E e);
}
