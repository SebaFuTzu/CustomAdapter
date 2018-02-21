package com.sebafutzu.customadapter.Entidades;

/**
 * Created by SebaFuTzu on 20-02-2018.
 */

public class ItemLista {
    private int id;
    private String nombre;
    private boolean activo;
    private int imagen;

    public ItemLista(int id, String nombre, boolean activo, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.imagen = imagen;
    }

    public ItemLista() {
        this.id = 0;
        this.nombre = "";
        this.activo = false;
        this.imagen = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
