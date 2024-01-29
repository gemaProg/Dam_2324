package correccion;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        int opcion = 0;
        int producto;
        do {
            Scanner lector = new Scanner(System.in);
            System.out.println(" Ingrese el numero 1 para calcular numeros impares. \n Ingrese el numero 2 para calcular la suma de numeros deficientes.\n Ingrese el numero 3 para salir del programa.");


            opcion = lector.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese 5 numeros impares");
                    int num1 = lector.nextInt();
                    int num2 = lector.nextInt();
                    int num3 = lector.nextInt();
                    int num4 = lector.nextInt();
                    int num5 = lector.nextInt();
                    producto = num1 * num2 * num3 * num4 * num5;
                    if (num1%2!=0)
                        producto = producto*num1;
                    if (num1 == 0) {
                        System.out.println("Haz introducido un 0");
                    } else {
                        if (num2 == 0) {
                            System.out.println("Haz introducido un 0");
                        } else {
                            if (num3 == 0) {
                                System.out.println("Haz introducido un 0");
                            } else {
                                if (num4 == 0) {
                                    System.out.println("Haz introducido un 0");
                                } else {
                                    if (num5 == 0) {
                                        System.out.println("Haz introducido un 0");
                                    } else {
                                        System.out.println(producto);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese numeros deficientes");
                    int numdef1 = lector.nextInt();
                    int numdef2 = lector.nextInt();
                    int numdef3 = lector.nextInt();
                    int numdef4 = lector.nextInt();
                    int suma = numdef1 + numdef2 + numdef3 + numdef4;
                    if (numdef1 == 0) {
                        System.out.println("Haz introducido un -1");
                    } else {
                        if (numdef2 == 0) {
                            System.out.println("Haz introducido un -1");
                        } else {
                            if (numdef3 == 0) {
                                System.out.println("Haz introducido un -1");
                            } else {
                                if (numdef4 == 0) {
                                    System.out.println("Haz introducido un -1");
                                } else {
                                    System.out.println("La suma de los numeros deficientes introducidos es: " + suma);
                                }
                            }

                        }

                    }
                case 3:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 3);


    }
}
