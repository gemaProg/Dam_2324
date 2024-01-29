package RestauranteFranklin;

public class Cocinero extends Empleado{
    //Atributos

    private int a_trabajados;
    private String especialidad;

    //Constructores

    public Cocinero() {
        super();
        a_trabajados = 4;
        especialidad = "Panadería y Pastelería";
    }

    public Cocinero(String nombre, String apellidos, String tlf, String direccion, String dni, int edad, double salario, int a_trabajados, String especialidad) {
        super(nombre, apellidos, tlf, direccion, dni, edad, salario);
        this.a_trabajados = a_trabajados;
        this.especialidad = especialidad;
    }

    //Gets y Sets

    public int getA_trabajados() {
        return a_trabajados;
    }

    public void setA_trabajados(int a_trabajados) {
        this.a_trabajados = a_trabajados;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


    //Métodos

    @Override
    public double calcularSalario() {
        return getSalario()+(a_trabajados*50);
    }

    @Override
    public double calcularSalario(boolean temporada) {
        double salario = calcularSalario();
        if (temporada==true)
            salario = salario + 150;
        return salario;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() + String.format("\nAños trabajados: " + a_trabajados + "\nEspecialidad: " + especialidad + "\nEl salario total es de: " + calcularSalario() + "\n");
    }
}
