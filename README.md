docs/diagrama-clases.md
# Diagrama de Clases

## Proyecto Integrador - Programación III

```mermaid
classDiagram

    class Persona {
        <<abstract>>
        #String nombre
        #String dui
        +Persona(String nombre, String dui)
        +String presentarse()
        +double calcularBeneficioAnual()*
        +String getNombre()
        +String getDui()
    }

    class Cliente {
        -String codigoCliente
        +Cliente(String nombre, String dui, String codigoCliente)
        +String getCodigoCliente()
        +void comprar(String producto)
        +double calcularBeneficioAnual()
        +String toString()
    }

    class Empleado {
        #double salario
        +Empleado(String nombre, String dui, double salario)
        +double getSalario()
        +double calcularBeneficioAnual()
        +String toString()
    }

    class Estudiante {
        -String carnet
        -String carrera
        +Estudiante(String nombre, String dui, String carnet, String carrera)
        +String getCarnet()
        +String getCarrera()
        +void matricular(String materia)
        +double calcularBeneficioAnual()
        +String toString()
    }

    class Docente {
        -String especialidad
        -int aniosExperiencia
        +Docente(String nombre, String dui, String especialidad, int aniosExperiencia)
        +String getEspecialidad()
        +int getAniosExperiencia()
        +void impartirClase(String materia)
        +double calcularBeneficioAnual()
        +String toString()
    }

    class Voluntario {
        -String area
        -int horas
        +Voluntario(String nombre, String dui, String area, int horas)
        +String getArea()
        +int getHoras()
        +void realizarActividad(String actividad)
        +double calcularBeneficioAnual()
        +String toString()
    }

    class Gerente {
        -int tamanoEquipo
        +Gerente(String nombre, String dui, double salario, int tamanoEquipo)
        +int getTamanoEquipo()
        +double calcularBeneficioAnual()
        +String toString()
    }

    Persona <|-- Cliente
    Persona <|-- Empleado
    Persona <|-- Estudiante
    Persona <|-- Docente
    Persona <|-- Voluntario

    Empleado <|-- Gerente
