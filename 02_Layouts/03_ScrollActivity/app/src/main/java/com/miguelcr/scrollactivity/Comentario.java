package com.miguelcr.scrollactivity;

/**
 * Created by miguelcampos on 6/6/16.
 */
public class Comentario {
    private String usuario, sitio, comentario, fecha;

    public Comentario(String usuario, String sitio, String comentario, String fecha) {
        this.usuario = usuario;
        this.sitio = sitio;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
