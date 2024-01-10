package P1;

public class Punto {
    private double x;
    private double y;

    public Punto (){
        x = Math.random()*100;
        y = Math.random()*100;
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
