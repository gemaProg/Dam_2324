package correccion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int fila;
        int columna;
        int N;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        N = lector.nextInt();

        for (fila = 0; fila < N; fila++) {
            for (columna = 0; columna <= fila; columna++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
