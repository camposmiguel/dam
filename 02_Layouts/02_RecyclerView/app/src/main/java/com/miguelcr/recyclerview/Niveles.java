package com.miguelcr.recyclerview;

/**
 * Created by miguelcampos on 30/5/16.
 */
public class Niveles {
    private String nombre, descripcion;

    public Niveles() {
    }

    public Niveles(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
