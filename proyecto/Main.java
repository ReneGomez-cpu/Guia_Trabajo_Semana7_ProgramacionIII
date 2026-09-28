package com.uped.proyecto;

import com.uped.proyecto.modelo.Cliente;
import com.uped.proyecto.modelo.Docente;
import com.uped.proyecto.modelo.Empleado;
import com.uped.proyecto.modelo.Estudiante;
import com.uped.proyecto.modelo.Gerente;
import com.uped.proyecto.modelo.Persona;
import com.uped.proyecto.modelo.Voluntario;
public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("PROYECTO INTEGRADOR");
        System.out.println("=================================");

        // CLIENTE
        Cliente cliente = new Cliente(
                "Carlos Ramírez",
                "06123456-7",
                "CLI-001"
        );

        System.out.println("\n--- CLIENTE ---");
        System.out.println(cliente);
        cliente.comprar("Laptop");

        // EMPLEADO
        Empleado empleado = new Empleado(
                "Ana López",
                "04876543-2",
                800.0
        );

        System.out.println("\n--- EMPLEADO ---");
        System.out.println(empleado);
        System.out.println(
                "Beneficio: "
                        + empleado.calcularBeneficioAnual()
        );

        // ESTUDIANTE
        Estudiante estudiante = new Estudiante(
                "Carlos Ramírez",
                "06123456-7",
                "UPED-2026-045",
                "Ingeniería de Software"
        );

        System.out.println("\n--- ESTUDIANTE ---");
        System.out.println(estudiante);
        estudiante.matricular("Programación III");

        // DOCENTE
        Docente docente = new Docente(
                "María Hernández",
                "05987654-3",
                "Ingeniería de Software",
                8
        );

        System.out.println("\n--- DOCENTE ---");
        System.out.println(docente);
        docente.impartirClase("Programación III");

        System.out.println(
                "Beneficio: "
                        + docente.calcularBeneficioAnual()
        );

        // VOLUNTARIO
        Voluntario voluntario = new Voluntario(
                "José Martínez",
                "06789123-4",
                "Apoyo comunitario",
                20
        );

        System.out.println("\n--- VOLUNTARIO ---");
        System.out.println(voluntario);
        voluntario.realizarActividad("Campaña comunitaria");

        // GERENTE
        Gerente gerente = new Gerente(
                "Marta Díaz",
                "05123456-7",
                1200.0,
                5
        );

        System.out.println("\n--- GERENTE ---");
        System.out.println(gerente);

        System.out.println(
                "Beneficio: "
                        + gerente.calcularBeneficioAnual()
        );

        // ==========================================
        // UPCASTING
        // ==========================================

        System.out.println("\n--- UPCASTING ---");

        Persona persona = gerente;

        System.out.println(persona.presentarse());

        System.out.println(
                "Beneficio desde Persona: "
                        + persona.calcularBeneficioAnual()
        );

        // ==========================================
        // DOWNCASTING SEGURO
        // ==========================================

        System.out.println("\n--- DOWNCASTING SEGURO ---");

        if (persona instanceof Gerente) {

            Gerente g = (Gerente) persona;

            System.out.println(
                    "Tamaño del equipo: "
                            + g.getTamanoEquipo()
            );
        }

        System.out.println("\n=================================");
        System.out.println("       FIN DEL PROGRAMA");
        System.out.println("=================================");
    }
}