package com.miguelcr.appguarderia;

/**
 * Created by miguelcampos on 6/4/16.
 */
public class Alumnos {
    private String nombre;
    private int depositadoManana, depositadoTarde, comidaManana, comidaTarde;
    private boolean siestaManana, siestaTarde;

    public Alumnos() {
    }

    public Alumnos(String nombre, int depositadoManana, int depositadoTarde, int comidaManana, int comidaTarde, boolean siestaManana, boolean siestaTarde) {
        this.nombre = nombre;
        this.depositadoManana = depositadoManana;
        this.depositadoTarde = depositadoTarde;
        this.comidaManana = comidaManana;
        this.comidaTarde = comidaTarde;
        this.siestaManana = siestaManana;
        this.siestaTarde = siestaTarde;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDepositadoManana() {
        return depositadoManana;
    }

    public void setDepositadoManana(int depositadoManana) {
        this.depositadoManana = depositadoManana;
    }

    public int getDepositadoTarde() {
        return depositadoTarde;
    }

    public void setDepositadoTarde(int depositadoTarde) {
        this.depositadoTarde = depositadoTarde;
    }

    public int getComidaManana() {
        return comidaManana;
    }

    public void setComidaManana(int comidaManana) {
        this.comidaManana = comidaManana;
    }

    public int getComidaTarde() {
        return comidaTarde;
    }

    public void setComidaTarde(int comidaTarde) {
        this.comidaTarde = comidaTarde;
    }

    public boolean isSiestaManana() {
        return siestaManana;
    }

    public void setSiestaManana(boolean siestaManana) {
        this.siestaManana = siestaManana;
    }

    public boolean isSiestaTarde() {
        return siestaTarde;
    }

    public void setSiestaTarde(boolean siestaTarde) {
        this.siestaTarde = siestaTarde;
    }
}
