package granja;

public class Utilidades {
    public static final String [] nombres ={"Paco","Maksim", "Quien", "Goku", "MartiMcFly"};
    public static String getNombreAleatorio(){
        return Utilidades.nombres[(int)(Math.random()*Utilidades.nombres.length)];
    }
}
