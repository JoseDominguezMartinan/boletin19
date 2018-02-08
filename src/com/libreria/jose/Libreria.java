/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.jose;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jdominguezmartinan
 */
public class Libreria {
    
    ArrayList <Libros> lib=new ArrayList();
    
    public void engade(Libros l) // engadir un libro a nosa libreria
    {
        lib.add(l);
    }
    public void vender(String isbn) throws ExcepcionNulo // para vender un libro disminuimos a cantidade de libros que temos en un, en caso de ser cero a cantidade de libros mostraremos o aviso de que non existe libros
    {
        if(lib.size()==0)
            throw new ExcepcionNulo("a libreria non ten libros");
        for(int i=0;i<lib.size();i++){
            
            if (isbn.equals(lib.get(i).getIsbn())){
               if(lib.get(i).getNumeroUnidades()>0){ 
                 lib.get(i).setNumeroUnidades((lib.get(i).getNumeroUnidades()-1));
               }
               else System.out.println("non hai existencias en stock");
            
         }
        }
    }
    // temos que amosar os libros que temos ordenados alfabeticamente
    public void amosar() throws ExcepcionNulo{
    if(lib.size()==0)
        throw new ExcepcionNulo("a libreria non ten libros");
       Collections.sort(lib); // para que isto funcione na clase libro temos que ter o metodo compareTo , e na clase implements Comparable
        for(int i=0;i<lib.size();i++){
            System.out.println(lib.get(i));  
       
        }
        }
        
          
      
    
     public void elimina() throws ExcepcionNulo // elimina os rexistros con numero de unidades cero 
    {
         if(lib.size()==0)
             throw new ExcepcionNulo("a libreria non ten libros");
      for(int i=0;i<lib.size();i++){
          if(lib.get(i).getNumeroUnidades()<=0) {
              lib.remove(i);
          } 
         
    }
  
     }
     // consultar un libro determinado buscando polo seu titulo
     public void consultarLibro(String titulo) throws ExcepcionNulo{
         if(lib.size()==0)
             throw new ExcepcionNulo("A libreria non ten libros");
         for(int i=0;i<lib.size();i++){
             if(titulo.equalsIgnoreCase(lib.get(i).getTitulo())){
                 System.out.println(lib.get(i));
             }
         }
     }
     
}
