package CorreccionMario.String;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nombre;
        System.out.println("Dime tu nombre");
        nombre=scanner.nextLine();
        String apellido1;
        System.out.println("Dime tu primer apellido");
        apellido1=scanner.nextLine();
        String apellido2;
        System.out.println("Dime tu segundo apellido");
        apellido2=scanner.nextLine();
        System.out.println(OperacionesString.iniciales(nombre,apellido1,apellido2));

    }
}
