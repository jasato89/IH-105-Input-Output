package com.ironhack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        System.out.println("Hola mundo");
        System.out.printf("Buenas tardes \n Qué tal va todo\n Espero que bien\n");
        System.err.println("Esto es un error total");
        int i = 10;
        int x = 12;
        int z = i + x;
        z = suma(i, x);



        Scanner keyboard = new Scanner(System.in);

        System.out.println("Por favor introduce tu nombre:");
        String name = keyboard.nextLine();
        System.out.println("Por favor, introduce tu apellido");
        String surname = keyboard.nextLine();
        System.out.println("Por favor, introduce tu edad");
        int age = keyboard.nextInt();
        while (age <= 0 || age > 130) {
            System.err.println("Edad incorrecta. Por favor, introduce tu edad");
            age = keyboard.nextInt();
        }
        if (age > 18) {
            System.out.println("Bienvenido " + name + " " + surname + ", tu edad es  " + age);

        } else {
            System.err.println(name + " " + surname + " : Acceso no permitido");
        }
         */


        FileWriter fileWriter = new FileWriter("./ejemplo.txt", true);

        fileWriter.write("Hola buenos días\n");

        fileWriter.write("Qué tal?\n");

        fileWriter.close();

        File file = new File("lista-de-la-compra.txt");
        Scanner reader = new Scanner(file);
        String listaDeLaCompra = "";

        while(reader.hasNextLine()) {

            listaDeLaCompra += reader.nextLine();

        }
        System.out.println(listaDeLaCompra);




    }

}
