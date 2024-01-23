package granja;

public class Cerdo extends Animal {

    public Cerdo(){
        super();
    }
    public Cerdo(String nombre, int edad, float peso){
        super(nombre,edad,peso);
    }
    @Override
    public double media() {
        return 0;
    }
}
