package granja;

import java.util.Random;
import java.util.Scanner;

/*
1. Implementar otra clase de un animal. Ejemplo: granja.Cerdo, granja.Oveja, granja.Vaca, Caballo, etc..
2. Array de Gallinas
 */
public class Main {

    public static Animal creaAnimal() {
        Scanner lector = new Scanner(System.in);
        Animal aux = null;
        int opcion;
        do {
            System.out.println("Elige: 1. Vaca 2.Gallina");
            opcion = lector.nextInt();
        } while (opcion != 1 && opcion != 2);

        System.out.println("Introduce: nombre, edad, peso");
        lector.nextLine();
        String nombre = lector.nextLine();

        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        if (opcion == 1)
            //System.out.println(); //pedir leche
            aux = new Vaca(nombre, edad, peso);
        else {
            //System.out.println(); //pedir huevos
            aux = new Gallina(nombre, edad, peso);
        }

        return aux;
    }

    public static void main(String[] args) {
       /* Gallina random = new Gallina();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, edad y peso");
        String nombre = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        Gallina especial= new Gallina(nombre, edad, peso);
        System.out.println(random.toString());
        System.out.println(especial.toString());
        System.out.println("Después de un año....");
        random.setEdad(random.getEdad()+1);
        random.setPeso(random.getPeso()+0.5f);
        especial.setEdad(especial.getEdad()+1);
        especial.setPeso(especial.getPeso()+0.75f);
        System.out.println(random.getPeso());
        System.out.println(especial.getPeso());
        especial.huevosDia(2,3);
        System.out.println(especial);*/
        /*
        //POO herencia
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce nombre, edad y peso");
        String nombre = lector.nextLine();
        int edad = lector.nextInt();
        float peso = lector.nextFloat();
        Gallina especial= new Gallina(nombre, edad, peso);
        System.out.println(especial.toString());
        Gallina random = new Gallina();
        System.out.println(random);*/
        /*
        Animal animal;
        animal = creaAnimal();
        System.out.println(animal);*/
        Granja granja = new Granja(12);
        System.out.println(granja);

    }

}