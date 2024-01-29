package RestauranteFranklin;

public abstract class Empleado {
    //Atributos

    private String nombre;
    private String apellidos;
    private String tlf;
    private String direccion;
    private String dni;
    private int edad;
    protected double salario;

    //Constructores

    public Empleado() {
        nombre = "Juan";
        apellidos = "Pérez";
        tlf = "635874196";
        direccion = "Calle jgqbeu ojrgbqbg";
        dni = "85662486E";
        edad = 25;
        salario = 1500;
    }

    public Empleado(String nombre, String apellidos, String tlf, String direccion, String dni, int edad, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlf = tlf;
        this.direccion = direccion;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
    }

    //Gets y Sets


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //toString


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + String.format("\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nTeléfono: " + tlf + "\nDirección: " + direccion
        + "\nEdad: " + edad + "\nDNI: " + dni + "\nSalario: " + salario);
    }

    //Métodos

    public abstract double calcularSalario();
    public abstract double calcularSalario(boolean temporada);
}
