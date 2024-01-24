package ElectrodomesticosClaudia;

public class Frigorifico extends Electrodomestico{
    private double capacidad;

    public Frigorifico(String id, double precio, double capacidad) {
        super(id, precio);
        this.capacidad = capacidad;
    }

    public Frigorifico() {
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
