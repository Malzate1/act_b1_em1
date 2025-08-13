package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores

        Estudiante estudiante1=new Estudiante("Manuel", 18, 4.5);
        Estudiante estudiante2=new Estudiante("Sara", 19, 4.4);
        
        // 2. Mostrar la información de ambos estudiantes

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // 3. Modificar algún atributo usando un setter

        estudiante1.setNombre("Carlos");
        estudiante2.setPromedio(5.0);

        // 4. Mostrar la información actualizada

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
    }
}