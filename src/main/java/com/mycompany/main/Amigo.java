package com.mycompany.main;

import java.util.Objects;


public class Amigo {
    private String nombre;

    public Amigo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amigo amigo = (Amigo) o;
        return Objects.equals(nombre, amigo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
