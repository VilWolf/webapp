package com.example.webapp.politicos;

public class Politico {

    private long id;
    private String nombre;
    private String apellido;
    private String apodo;
    private int edad;

    public Politico(long id, String nombre, String apellido, String apodo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Politico [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", apodo=" + apodo + ", edad="
                + edad + "]";
    }

}
