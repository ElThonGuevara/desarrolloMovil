package com.thom.myapplication.clases;

public class Contacto {
    public String nombre;
    public int numero;
    public Contacto(){
    }

    public Contacto(String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
}
