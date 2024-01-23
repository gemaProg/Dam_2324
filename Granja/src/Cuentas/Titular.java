package Cuentas;

public class Titular {

    private String nombre;
    private int edad;


    public Titular(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + ", de "+edad+ " años.";
    }
}


