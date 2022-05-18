package com.ironhack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println("Hola mundo");
        System.out.printf("Buenas tardes \n Qué tal va todo\n Espero que bien\n");
        System.err.println("Esto es un error total");
        int i = 10;
        int x = 12;
        int z = i + x;
        z = suma(i, x);

         */

        int[] numbers = {1, 2, 3, 4, 5 ,6};
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            } else {
                System.err.println("Número impar");
            }
        }
        System.out.println("Total números pares: " + counter);


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

    }

    private static int suma(int i, int x) {
        return x + i;
    }
}
