package granja;

import java.util.Arrays;
import java.util.Random;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected float peso;

    public Animal(){
        /*nombre = Utilidades.nombres[(int)(Math.random()*Utilidades.nombres.length)];
        edad= (int)(Math.random()*9);
        peso= (float)(Math.random()*100+1);*/
        this(Utilidades.nombres[(int)(Math.random()*Utilidades.nombres.length)],(int)(Math.random()*9),(float)(Math.random()*100+1));

    }

    public Animal(String nombre, int edad, float peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String toString(){
        return this.getClass().getSimpleName().toUpperCase()+"---"+String.format("Me llamo %s, este es mi peso %.2f, tengo %d años \n", nombre,peso,edad);
    }
}
