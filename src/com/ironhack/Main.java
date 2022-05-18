package com.ironhack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        System.out.println("Hola mundo");
        System.out.printf("Buenas tardes \n Qué tal va todo\n Espero que bien\n");
        //Ejemplo de error
        System.err.println("Esto es un error total");

        //Creamos un objeto de la clase Scanner para leer el stream del teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Por favor introduce tu nombre:");

        //Llamamos al keyboard para leer cada línea
        String name = keyboard.nextLine();
        System.out.println("Por favor, introduce tu apellido");
        String surname = keyboard.nextLine();
        System.out.println("Por favor, introduce tu edad");
        int age = keyboard.nextInt();

        //Mediante un bucle podemos añadir condiciones al input
        while (age <= 0 || age > 130) {
            System.err.println("Edad incorrecta. Por favor, introduce tu edad");
            age = keyboard.nextInt();
        }


        if (age > 18) {
            System.out.println("Bienvenido " + name + " " + surname + ", tu edad es  " + age);

        } else {
            System.err.println(name + " " + surname + " : Acceso no permitido");
        }


        FileWriter fileWriter = new FileWriter("./ejemplo.txt", true);

        fileWriter.write("Hola buenos días\n");
        int i = 12;

        fileWriter.write("Qué tal?\n");

        //Debemos convertir los valores númericos a String
        fileWriter.write(String.valueOf(i));

        fileWriter.close();

        File file = new File("lista-de-la-compra.txt");
        Scanner reader = new Scanner(file);
        StringBuilder listaDeLaCompra = new StringBuilder();

        while (reader.hasNextLine()) {

            listaDeLaCompra.append(reader.nextLine());

        }
        System.out.println(listaDeLaCompra);

        //SOLUCION EJERCICIO
        // Open file to be written in
        FileWriter writer = new FileWriter("result.txt", true);

        // Open file
        File file = new File("oscar_age_female.csv");

        // Create scanner object to iterate over the file
        Scanner scanner = new Scanner(file);

        // Skip first line
        String data = scanner.nextLine();

        // Iterate over the file
        while (scanner.hasNextLine()) {
            data = scanner.nextLine();
            // Split the line to have each  column
            String[] row = data.split(",");

            // Print on the file
            writer.write("Name: " + row[3] + "\n");
            writer.write("Year: " + row[1] + "\n");
            writer.write("Age: " + row[2] + "\n");
            writer.write("Movie: " + row[4] + "\n");
            writer.write("==================" + "\n");
        }

        // Close buffers
        scanner.close();
        writer.close();

    }


}


