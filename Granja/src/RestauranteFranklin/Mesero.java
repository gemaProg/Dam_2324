package RestauranteFranklin;

public class Mesero extends Empleado{
    //Atributos

    private double propinas;
    private String idiomas;

    //Constructores

    public Mesero() {
        super();
        propinas = 80;
        idiomas = "Español/Inglés";
    }

    public Mesero(String nombre, String apellidos, String tlf, String direccion, String dni, int edad, double salario, double propinas, String idiomas) {
        super(nombre, apellidos, tlf, direccion, dni, edad, salario);
        this.propinas = propinas;
        this.idiomas = idiomas;
    }

    //Gets y Sets


    public double getPropinas() {
        return propinas;
    }

    public void setPropinas(double propinas) {
        this.propinas = propinas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() + String.format("\nPropinas acumuladas en el mes: " + propinas + "\nIdiomas: " + idiomas + "\nEl salario total es de: " + calcularSalario() + "\n");
    }

    //Métodos
    @Override
    public double calcularSalario() {
        return getSalario() + propinas;
    }

    @Override
    public double calcularSalario(boolean temporada) {
        double salarioBase = calcularSalario();
        /*String [] queIdiomas = idiomas.split("/");
        int numIdiomas = queIdiomas.length;*/
        int numIdiomas =  idiomas.split("/").length;
        salarioBase = salarioBase+numIdiomas*50;
        //return temporada==true?salarioBase*1.7:salarioBase;
        return temporada?salarioBase*1.7:salarioBase;
    }
}
