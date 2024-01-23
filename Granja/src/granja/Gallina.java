package granja;

import java.util.Arrays;

public class Gallina extends Animal{
    private int id;
    private int [] huevosSemana;
    private static int contador;


    public Gallina() {
        super();
        contador++;
        id = contador;
        huevosSemana = new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i] = (int)(Math.random()*3);
        }

    }

    public Gallina(String nombre, int edad, float peso){
        super(nombre,edad,peso);
        contador++;
        huevosSemana = new int[7];
        for (int i = 0; i < huevosSemana.length; i++) {
            huevosSemana[i] = (int)(Math.random()*3);
        }
    }

    public int[] getHuevosSemana() {
        return huevosSemana;
    }

    public void setHuevosSemana(int[] huevosSemana) {
        this.huevosSemana = huevosSemana;
    }



    public void huevosDia(int dia, int huevos){
        huevosSemana[dia-1] = huevos;
    }

    public double media() {
        double media=0;
        for (int i = 0; i < huevosSemana.length; i++) {
            media += huevosSemana[i];
        }
        return media/huevosSemana.length;
    }
    public String toString(){
        return super.toString() + String.format("y pongo a la semana \n %s", Arrays.toString(huevosSemana));
    }


}
