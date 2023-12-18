package CorreccionMario;

import java.util.Arrays;
import java.util.Scanner;

public class TesterArray {
    public static void main(String[] args) {
       /* int numx = 5;

        System.out.println(OperacionesArray.cambiaValor(numx));
        System.out.println(numx);


        Scanner scanner=new Scanner(System.in);
        int numero[]=new int[10];
        OperacionesArray.cargar(numero);
        System.out.println("Array Inicial");
        OperacionesArray.mostrar(numero);
        System.out.println();
        System.out.println("Array invertido");
        OperacionesArray.invertir(numero);
        System.out.println();
        System.out.println("Array ordenado");
        OperacionesArray.ordenar(numero);
        OperacionesArray.mostrar(numero);
        System.out.println();
        double media=OperacionesArray.media(numero);
        System.out.println("La media es: "+media);
        System.out.println();
        System.out.println("Que numero quieres saber si esta");
        int num= scanner.nextInt();
        OperacionesArray.estar(numero, num);
       */ int numeros[] = {1,2,3,4};
        OperacionesArray.mostrar(numeros);

        OperacionesArray.copiaInvertida(numeros);

    }

}
