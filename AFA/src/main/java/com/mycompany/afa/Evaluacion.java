/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.afa;

/**
 *
 * @author T107
 */
public class Evaluacion {
    String nombre;
    float calificaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(float calificaciones) {
        this.calificaciones = calificaciones;
    }

    public Evaluacion(String nombre, float calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
    
    
}
