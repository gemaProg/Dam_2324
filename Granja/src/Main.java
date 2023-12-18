import java.util.Scanner;
/*
1. Implementar otra clase de un animal. Ejemplo: Cerdo, Oveja, Vaca, Caballo, etc..
2. Array de Gallinas
 */
public class Main {
    public static void main(String[] args) {

        Gallina random = new Gallina();
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
        System.out.println(especial);
    }
}