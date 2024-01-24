package ElectrodomesticosClaudia;

public class Lavadora extends Electrodomestico{
    private double capacidad;
    public Lavadora() {
        super();
    }
    @Override
    public double calcularPrecio() {
        //return (capacidad>1000)?precio*1.1*(capacidad-1000):precio;
        return (capacidad>1000)?precio+100:precio;
    }

    @Override
    public double calcularPrecio(boolean promocion) {
        double precioReal = calcularPrecio();
        //return promocion?precioReal*0.8:precioReal;
        if (promocion)
            precioReal = precioReal*0.8;
        return precioReal;

    }
}
