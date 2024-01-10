package P1;

public class Tester {


    public static void main(String[] args) {
        Punto punto = new Punto();
        System.out.println(punto.getX());
        Punto punto1 = new Punto(4,4);
        System.out.println(punto1.toString());
        /*int lista[] = new int[10];
        Punto puntos[] = new Punto[5];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto();
        }

        for (int i = 0; i < puntos.length; i++) {
            System.out.println(puntos[i]);
        }*/
        System.out.println(punto.calcularDistanciaDesde(punto1));
        Circulo circulo = new Circulo();
        System.out.println(circulo);

    }
}
