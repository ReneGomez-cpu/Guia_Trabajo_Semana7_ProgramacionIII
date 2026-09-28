package com.uped.proyecto.modelo;

public class Gerente extends Empleado {
    private int tamanoEquipo;
    public Gerente(String nombre, String dui,
                   double salario, int tamanoEquipo) {
        super(nombre, dui, salario);   // encadena hacia Empleado
        this.tamanoEquipo = tamanoEquipo;
    }
    public int getTamanoEquipo() {
        return tamanoEquipo;
    }
    @Override
    public double calcularBeneficioAnual() {
        double base = super.calcularBeneficioAnual(); // 1200 * 0.10 = 120.0
        double bonoEquipo = tamanoEquipo * 25.0;      // 5 * 25.0   = 125.0
        return base + bonoEquipo;                     //             = 245.0
    }
    @Override
    public String toString() {
        return presentarse() + " | Equipo: " + tamanoEquipo;
    }
}