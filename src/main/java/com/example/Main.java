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

       Libro libro1=new Libro("El amor en los tiempos del cólera","Gabriel García Márquez" , 60000);

        // 2. Crear un libro usando el constructor con solo titulo y autor

        Libro libro2=new Libro("El visitante", "Stephen King");

        // 3. Mostrar información de ambos libros

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // 4. Aplicar descuento usando ambas versiones del método

        libro1.aplicarDescuento(10, 50000);
        libro2.aplicarDescuento(5);

        // 5. Mostrar información actualizada de los libros

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

    }
}