package com.uped.proyecto;

import com.uped.proyecto.modelo.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente(
                "Marta Díaz", "05123456-7", 1200.0, 5);

        System.out.println(g);
        System.out.println("Beneficio: " + g.calcularBeneficioAnual());
    }
}