/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.jose;

import java.util.ArrayList;

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
    public void vender(String isbn) // para vender un libroo disminuimos a cantidade de libros que temos en un, en caso de ser cero a cantidade de libros mostraremos o aviso de que non existe libros
    {
        for(int i=0;i<lib.size();i++){
            if (isbn==lib.get(i).getIsbn()){
               if(lib.get(i).getNumeroUnidades()>0){ 
                 lib.get(i).setNumeroUnidades((lib.get(i).getNumeroUnidades()-1));
               }
               else System.out.println("non hai existencias en stock");
            
         }
        }
    }
  
    
}
