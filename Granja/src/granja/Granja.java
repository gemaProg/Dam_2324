package granja;

public class Granja {
    private Animal[] listaAnimales;

    public Granja(Animal[] listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public Granja() {
        listaAnimales = new Animal[10];
        for (int i = 0; i < listaAnimales.length; i++) {
            if (i%2==0)
                listaAnimales[i] = new Gallina(); //
            else
                listaAnimales[i] = Main.creaAnimal(); //personalizado
        }
    }
}
