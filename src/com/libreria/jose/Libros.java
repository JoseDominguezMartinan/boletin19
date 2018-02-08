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
public class Libros implements Comparable
{

    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int numeroUnidades;

    public Libros()
    {
    }

    public Libros(String titulo,String autor,String isbn,float prezo,int numeroUnidades)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public float getPrezo()
    {
        return prezo;
    }

    public void setPrezo(float prezo)
    {
        this.prezo = prezo;
    }

    public int getNumeroUnidades()
    {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades)
    {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString()
    {
        return "Libros{"+"titulo="+titulo+", autor="+autor+", isbn="+isbn+", prezo="+prezo+", numeroUnidades="+numeroUnidades+'}';
    }

    @Override
    public int compareTo(Object o)
    {
        Libros l = (Libros) o;
        if(l.titulo.compareToIgnoreCase(this.titulo)==0)
        {
            return 0;
        } else if(l.titulo.compareToIgnoreCase(this.titulo)>0)
        {
            return 1;
        } else
        {
            return -1;
        }
    }

}
