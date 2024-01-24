package ElectrodomesticosClaudia;

public abstract class Electrodomestico {
    protected String id; //int, intentar que sea único, ver clase Gallina de Granja
    protected double precio;

    public Electrodomestico(String id, double precio) {
        this.id= id;
        this.precio = precio;
    }

    public Electrodomestico() {
        this.id= "a005";
        precio = 3;
    }

    public abstract double calcularPrecio();
    public abstract double calcularPrecio(boolean promocion);


}
