package granja;

import java.util.Arrays;

public class Vaca extends Animal{
    private double [] leche;

    public Vaca() {
        super();
    }

    public Vaca(String nombre, int edad, float peso, double[] leche) {
        super(nombre, edad, peso);
        this.leche = leche;
    }

    public Vaca(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
        leche = new double[7];
        for (int i = 0; i < leche.length; i++) {
            leche[i] = (int)(Math.random()*3);
        }
    }
    public double[] getLeche() {
        return leche;
    }

    public void setLeche(double[] leche) {
        this.leche = leche;
    }

    public String toString(){
        return super.toString() + String.format("y pongo a la semana \n %s", Arrays.toString(leche));
    }

}
