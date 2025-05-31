package main;

import models.Persona;


import java.util.Scanner;

public class Main {
    public static void main (String args []) {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        String saludo = "Hola desde la UNIVALLE";
        String nombre;
        int edad;
        System.out.println(saludo);
        System.out.print("como te llamas?: ");
        nombre = leer.nextLine();
        System.out.print("que edad tienes ");
        edad = leer.nextInt();
        persona.setNombre(nombre);
        persona.setEdad(edad);

        System.out.print(persona);


    }

}
