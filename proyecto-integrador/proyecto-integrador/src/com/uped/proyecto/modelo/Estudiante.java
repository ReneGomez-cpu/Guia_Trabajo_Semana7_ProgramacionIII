package com.uped.proyecto.modelo;

public class Estudiante extends Persona {

    private String carnet;
    private String carrera;

    public Estudiante(
            String nombre,
            String dui,
            String carnet,
            String carrera) {

        super(nombre, dui);
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public String getCarnet() {
        return carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void matricular(String materia) {
        System.out.println(carnet + " matriculo: " + materia);
    }

    @Override
    public double calcularBeneficioAnual() {
        return 0.0;
    }

    @Override
    public String toString() {
        return presentarse()
                + " | "
                + carrera
                + " ("
                + carnet
                + ")";
    }
}