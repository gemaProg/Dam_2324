package CorreccionMario;

import java.util.Arrays;
import java.util.Random;

public class OperacionesArray {

    public static int cambiaValor (int numero){
        return numero*2;
    }
    public static void cargar(int numero[]){
        Random random=new Random();
        for (int i = 0; i < numero.length ; i++) {
            numero[i]= random.nextInt(1,10);
        }

    }

    public static void mostrar(int numero[]){
        for (int i = 0; i < numero.length ; i++) {
            System.out.print(numero[i]+" ");
        }
    }

    public static void ordenar(int numero[]){
        Arrays.sort(numero);
    }

    public static double media (int[] numero){
        double suma=0;
        for (int i = 0; i < numero.length ; i++) {
            suma=suma+numero[i];

        }
        return suma/10;
    }

    public static void invertir(int numero[]){
        for (int i = 9; i >-1 ; i--) {
            System.out.print(numero[i]+" ");
        }
    }
    public static int [] copiaInvertida(int numero[]){
        int copia[] = new int[numero.length];
        for (int i = 0; i < numero.length; i++) {
            copia[i] = numero[i];
        }
        int copia2[] = Arrays.copyOf(numero,numero.length);
        /*System.out.println(Arrays.toString(copia));
        System.out.println(Arrays.toString(copia2));*/
        for (int i = 0, j= copia.length-1; i<j; i++,j--) {
            int aux =copia[i];
            copia[i]= copia[j];
            copia[j]=aux;
        }
        return copia;
    }
    public static int[] copia(int[] numeros){
        return Arrays.copyOf(numeros, numeros.length);
    }
    public  static  void estar (int numero[],int num){
        boolean si=false;
        int posicion=0;
        for (int i = 0; i < numero.length; i++) {
           if (num==numero[i]){
               si=true;
               posicion=i;
           }
        }
        if (si==true){
            System.out.println("El numero se encuantra en la posición: "+ posicion);
        }else
            System.out.println("El numero no esta");
    }

}
