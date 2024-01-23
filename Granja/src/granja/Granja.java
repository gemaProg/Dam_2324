package granja;

import java.util.Arrays;

public class Granja {
    private Animal[] listaAnimales;

    public Granja(Animal[] listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public Granja() {
       this(10);
    }

    public Granja(int tamanyo) {
        listaAnimales = new Animal[tamanyo];
        for (int i = 0; i < listaAnimales.length/2; i++) {
            if (i%2==0)
                listaAnimales[i] = new Gallina(); //
            else
                //listaAnimales[i] = Main.creaAnimal(); //personalizado
                listaAnimales[i] = new Vaca();
        }
        for (int i = listaAnimales.length/2 ; i < listaAnimales.length; i++) {
            listaAnimales[i] = new Cerdo();
        }
    }

    public void media(){
        for (int i = 0; i < listaAnimales.length; i++) {
            System.out.println(listaAnimales[i] +" produce de media "+ listaAnimales[i].media());
        }

    }

    @Override
    public String toString() {
        return "Granja{" +
                "listaAnimales=" + Arrays.toString(listaAnimales) +
                '}';
    }
}
