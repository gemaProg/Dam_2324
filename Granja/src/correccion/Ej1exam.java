package correccion;

import java.util.Scanner;

public class Ej1exam {
    public static void main(String[] args) {

        int opcion;

        //Case 1 parte
        int numero1;
        int suma=0;

        //Case 2 parte

        int numero2;
        int deficiente=0;
        int suma2=0;

        Scanner lector = new Scanner(System.in);

        do {

            System.out.println("Escoja una opcion .1 Impares  .2 Abundante .3 Salir ");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1: {
                    do {
                        System.out.println("Dame números , los impares se sumaran , escoja 0 para terminar");
                        numero1 = lector.nextInt();
                        if (numero1%2!=0) {
                            suma = suma + numero1;
                            System.out.println("Es impar");
                        }
                    } while (numero1!=0);
                    System.out.println("La suma total es de "+suma);
                }
                break;

                case 2: {

                    do {
                        System.out.println("Dame números , los deficientes se sumaran , escoja -1 para terminar");
                        numero2 = lector.nextInt();
                        deficiente=0;
                        for (int c=1; c < numero2 ; c++){
                            if (numero2%c==0) {
                                deficiente = deficiente + c;
                                System.out.println(deficiente);
                            }
                        }
                        if (deficiente<numero2){
                            suma2 = suma2 + numero2;
                            System.out.println("Es abundante");
                        }

                    } while (numero2!=-1);
                    System.out.println("La suma total es de "+suma2);

                }
                break;

                case 3: {

                    System.out.println("Fin de programa");

                }
                break;
            }
        } while (opcion!=3);


    }
}