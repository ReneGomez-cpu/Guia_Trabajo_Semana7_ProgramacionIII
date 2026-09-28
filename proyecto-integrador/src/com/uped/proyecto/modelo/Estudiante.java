package com.uped.proyecto.modelo;

public class Estudiante extends Persona {
    private String carrera;
    private int ciclo;
    public Estudiante(String nombre, String dui, String carrera, int ciclo) {
        super(nombre, dui);
        this.carrera = carrera;
        this.ciclo = ciclo;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getCiclo() {
        return ciclo;
    }
    @Override
    public double calcularBeneficioAnual() {
        // Un estudiante no genera beneficio económico
        return 0.0;
    }
    @Override
    public String toString() {
        return presentarse() + " | Carrera: " + carrera + " | Ciclo: " + ciclo;
    }
}