/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.jose;

/**
 *
 * @author jdominguezmartinan
 */
public class ExcepcionNulo extends Exception
{

    public ExcepcionNulo()
    {
        super("insertou un array nulo");
    }

    public ExcepcionNulo(String mensaxe)
    {
        super(mensaxe);
    }

}
