
package com.miguelcr.scrollactivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("categoria")
    @Expose
    private String categoria;
    @SerializedName("coordenadas")
    @Expose
    private Coordenadas coordenadas;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("foto")
    @Expose
    private Foto foto;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    /**
     * 
     * @return
     *     The categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * 
     * @param categoria
     *     The categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * 
     * @return
     *     The coordenadas
     */
    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    /**
     * 
     * @param coordenadas
     *     The coordenadas
     */
    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return
     *     The direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion
     *     The direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return
     *     The foto
     */
    public Foto getFoto() {
        return foto;
    }

    /**
     * 
     * @param foto
     *     The foto
     */
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    /**
     * 
     * @return
     *     The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     *     The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     *     The objectId
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * 
     * @param objectId
     *     The objectId
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    /**
     * 
     * @return
     *     The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono
     *     The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updatedAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


}
