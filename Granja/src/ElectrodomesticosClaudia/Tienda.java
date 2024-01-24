package ElectrodomesticosClaudia;

import granja.Animal;
import granja.Gallina;
import granja.Vaca;

public abstract class Tienda {
    private Electrodomestico [] productos;
    public Tienda(){
        productos = new Electrodomestico[10];
        for (int i = 0; i < productos.length/2; i++) {
            if (i%2==0)
                productos[i] = new Frigorifico(); //
            else
                //listaAnimales[i] = Main.creaAnimal(); //personalizado
                productos[i] = new Lavadora();
        }
    }
    public abstract boolean darAlta(Electrodomestico nuevo);
    public abstract boolean darBaja(String id);

    public abstract boolean modificar(double precio);
    public abstract boolean modificarCapacidad(double capacidad);

}
