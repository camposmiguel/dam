package com.miguelcr.recyclerview.pojos;

/**
 * Created by miguelcampos on 2/6/16.
 */
public class Ejercicio {
    private String titulo, categoria;
    int icono, duracion, distancia;

    public Ejercicio(String titulo, String categoria, int icono, int duracion, int distancia) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.icono = icono;
        this.duracion = duracion;
        this.distancia = distancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
