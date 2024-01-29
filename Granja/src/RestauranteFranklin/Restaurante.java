package RestauranteFranklin;

import java.util.Arrays;

public class Restaurante {
    //Atributos

    private Empleado[] empleados;

    //Constructores

    public Restaurante() {
        empleados = new Empleado[5];
        for (int i = 0; i < empleados.length; i++) {
            if (i % 2 == 0) {
                empleados[i] = new Mesero();
            } else {
                empleados[i] = new Cocinero();
            }
        }
    }

    public Restaurante(int cant) {
        empleados = new Empleado[cant];
    }

    //toString

    @Override
    public String toString() {
        return String.format("\nEl restaurante dispone de los siguientes empleado: " + Arrays.toString(empleados));
    }

    //Métodos

    public void darBaja(String dni) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            //if (dni.equalsIgnoreCase(empleados[i].getDni())) {
            if (empleados[i] != null && empleados[i].getDni().equalsIgnoreCase(dni)) {
                empleados[i] = null;
                salir = true;
            }
        }
    }

    public void darAlta(Empleado empleado) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                salir = true;
            }
        }

        if (salir == false) {
            System.out.println("Ya ha alcanzado la cantidad máxima de empleados");
        } else
            System.out.println("Empleado dado de alta con éxito");
    }

    public boolean darAlta2(Empleado empleado) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                salir = true;
            }
        }
        return salir;
    }

    public void listarEmpleados(int edad) {
        System.out.println("La lista de empleado con " + edad + " años de edad o más son:");
        boolean nadie = true;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null && empleados[i].getEdad() >= edad) {
                System.out.println(empleados[i].toString());
                nadie = false;
            }
        }
        if (nadie) {
            System.out.println("No hay empleados con esta edad o mayores");
        }
    }

    //??
    public void modificarAtriComun(String dni, double salarioNuevo) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i] != null && empleados[i].getDni().equalsIgnoreCase(dni)) {
                System.out.println("Los datos del empleado son los siguientes:");
                System.out.println(empleados[i].toString());
                empleados[i].setSalario(salarioNuevo);
                salir = true;
            }
        }
    }

    public void modificarAtriEspecifico(String dni, int antiguedad) {
        boolean salir = false;
        for (int i = 0; i < empleados.length && salir == false; i++) {
            if (empleados[i] != null && empleados[i].getDni().equalsIgnoreCase(dni)) {
                System.out.println("Los datos del empleado son los siguientes:");
                System.out.println(empleados[i].toString());
                //if (empleados[i].getClass().getSimpleName().equalsIgnoreCase("Cocinero")) {
                if (empleados[i] instanceof Cocinero) {
                    /*Cocinero aux = (Cocinero) empleados[i];
                    aux.setA_trabajados(antiguedad);*/
                    ((Cocinero) empleados[i]).setA_trabajados(antiguedad);
                    salir = true;
                    }
                }
            }
        }

    }
