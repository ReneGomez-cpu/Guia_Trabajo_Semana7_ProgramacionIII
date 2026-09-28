package com.uped.proyecto.modelo;

public class Voluntario extends Persona {
    private String organizacion;
    public Voluntario(String nombre, String dui, String organizacion) {
        super(nombre, dui);
        this.organizacion = organizacion;
    }
    public String getOrganizacion() {
        return organizacion;
    }

    @Override
    public double calcularBeneficioAnual() {

        return 0.0;
    }
    @Override
    public String toString() {
        return presentarse() + " | Organización: " + organizacion;
    }
}