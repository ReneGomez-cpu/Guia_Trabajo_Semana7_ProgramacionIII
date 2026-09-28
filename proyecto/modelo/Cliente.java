package com.uped.proyecto.modelo;

public class Cliente extends Persona {
    private String categoria;

    public Cliente(String nombre, String dui, String categoria) {
        super(nombre, dui);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double calcularBeneficioAnual() {
        // Un cliente no genera beneficio directo
        return 0.0;
    }

    @Override
    public String toString() {
        return presentarse() + " | Categoría: " + categoria;
    }

    public void comprar(String laptop) {

    }
}