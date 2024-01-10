package P1;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }
    public Circulo(){
        centro = new Punto();
        radio = Math.random()*100;
    }
    public Circulo(double x,double y,double radio){
        centro = new Punto(x,y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }
    public double calcularDistanciaDesde(Punto otroPunto){
        return centro.calcularDistanciaDesde(otroPunto)-radio;
    }
    public static double calcularDistanciaDesde(Punto puntoA, Punto puntoB){
        return Math.sqrt(Math.pow(puntoA.getX()-puntoB.getX(),2)+Math.pow(puntoA.getY()-puntoB.getY(),2));
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}
