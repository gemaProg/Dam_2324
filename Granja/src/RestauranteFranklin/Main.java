package RestauranteFranklin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Prueba

        Restaurante restaurante = new Restaurante();

        System.out.println(restaurante);
        System.out.println("Introduzca el DNI del empleado al que desea dar de baja");
        String dni = teclado.nextLine();
        restaurante.darBaja(dni);
        System.out.println(restaurante);
        restaurante.darAlta(new Cocinero("ejemplo","ejemplo","ejemplo","ejemplo","51224899D",28,1800,3,"Postres"));
        System.out.println(restaurante);
        restaurante.modificarAtriEspecifico("85662486E", 34);
        restaurante.listarEmpleados(20);



    }
}
