package Cuentas;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        CuentaCorriente[] cuentasCorrientes = new CuentaCorriente[100];
        CuentaAhorro[] cuentasAhorro = new CuentaAhorro[100];
        boolean exit = true;

        while (opcion != 5 && exit) {
            System.out.println("\n\n\t\t||Bienvenido a su cajero automatico||\n");
            System.out.println("Elija una opcion:\n");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Ingresar dinero en una cuenta");
            System.out.println("3. Retirar dinero de una cuenta");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.println();

            opcion = teclado.nextInt();


            switch (opcion) {


                case 1:
                    System.out.println("Elija una opcion:");
                    System.out.println("1. Crear una cuenta corriente");
                    System.out.println("2. Crear una cuenta ahorro");
                    opcion = teclado.nextInt();
                    teclado.nextLine();


                    switch (opcion) {
                        case 1:


                            boolean enter = true;
                            boolean cuenta_Existente = false;

                            System.out.print("Inserte el nombre del titular de la cuenta: ");
                            String nombre = teclado.nextLine();
                            System.out.print("Inserte su edad: ");
                            int edad = teclado.nextInt();
                            teclado.nextLine();
                            System.out.print("Inserte el número de cuenta: ");
                            String numero_Cuenta = teclado.nextLine();
                            System.out.print("Inserte el saldo de la cuenta: ");
                            double saldo = teclado.nextDouble();

                            for (int i = 0; i < cuentasCorrientes.length && !cuenta_Existente; i++) {
                                if (cuentasCorrientes[i] != null) {
                                    if (cuentasCorrientes[i].getNumeroCuenta().equals(numero_Cuenta)) {
                                        System.out.println("\nNúmero reservado a una cuenta ya existente");
                                        Thread.sleep(2000);
                                        cuenta_Existente = true;
                                    }
                                }

                            }
                            if (!cuenta_Existente) {
                                for (int i = 0; i < cuentasCorrientes.length && enter; i++) {
                                    if (cuentasCorrientes[i] == null) {
                                        cuentasCorrientes[i] = new CuentaCorriente(new Titular(nombre, edad), numero_Cuenta, saldo);
                                        enter = false;
                                        System.out.println("\nCreando la cuenta...");
                                        Thread.sleep(2000);
                                    }

                                }
                            }
                            break;

                        case 2:

                            enter = true;


                            System.out.print("Inserte el nombre del titular de la cuenta: ");
                            nombre = teclado.nextLine();
                            System.out.print("Inserte su edad: ");
                            edad = teclado.nextInt();
                            teclado.nextLine();
                            System.out.print("Inserte el número de cuenta: ");
                            numero_Cuenta = teclado.nextLine();
                            System.out.print("Inserte el saldo de la cuenta: ");
                            saldo = teclado.nextDouble();

                            System.out.print("Inserte el interes: ");
                            double interes = teclado.nextDouble();

                           /*u for (int i = 0; i < cuentasAhorro.length; i++) {
                                if (cuentasAhorro[i].getNumeroCuenta().equals(numero_Cuenta)&&cuentasAhorro[i]!=null){
                                    System.out.println("Número reservado a una cuenta ya existente");
                                    Thread.sleep(2000);
                                    break;}
                            }*/

                            for (int i = 0; i < cuentasAhorro.length && enter; i++) {

                                if (cuentasAhorro[i] == null) {
                                    cuentasAhorro[i] = new CuentaAhorro(new Titular(nombre, edad), numero_Cuenta, saldo, interes);
                                    enter = false;
                                }

                            }

                            System.out.println("\nCreando la cuenta...");
                            Thread.sleep(2000);
                            break;

                        default:
                            System.out.println("No ha insertado una opcion valida");
                    }
                    break;


                case 2:

                    System.out.print("Inserte su numero de cuenta: ");
                    String numerodecuenta = teclado.next();
                    teclado.nextLine();
                    System.out.print("Inserte la cantidad a ingresar: ");
                    double cantidad = teclado.nextDouble();

                    for (int i = 0; i < cuentasCorrientes.length && cuentasCorrientes[i] != null; i++) {

                        if (cuentasCorrientes[i].getNumeroCuenta().equals(numerodecuenta)) {
                            cuentasCorrientes[i].ingresar(cantidad);
                            break;
                        }

                    }

                    for (int i = 0; i < cuentasAhorro.length && cuentasAhorro[i] != null; i++) {

                        if (cuentasAhorro[i].getNumeroCuenta().equals(numerodecuenta)) {
                            cuentasAhorro[i].ingresar(cantidad);
                            break;
                        }

                    }
                    break;


                case 3:

                    System.out.print("Inserte su numero de cuenta: ");
                    numerodecuenta = teclado.next();
                    teclado.nextLine();
                    System.out.print("Inserte la cantidad a retirar: ");
                    cantidad = teclado.nextDouble();

                    for (int i = 0; i < cuentasCorrientes.length && cuentasCorrientes[i] != null; i++) {

                        if (cuentasCorrientes[i].getNumeroCuenta().equals(numerodecuenta)) {
                            cuentasCorrientes[i].reintegro(cantidad);
                            break;
                        }

                    }

                    for (int i = 0; i < cuentasAhorro.length && cuentasAhorro[i] != null; i++) {

                        if (cuentasAhorro[i].getNumeroCuenta().equals(numerodecuenta)) {
                            cuentasAhorro[i].reintegro(cantidad);
                            break;
                        }

                    }
                    break;


                case 4:


                    System.out.print("Inserte su numero de cuenta: ");
                    String numerocuenta = teclado.next();
                    teclado.nextLine();


                    for (int i = 0; i < cuentasCorrientes.length && cuentasCorrientes[i] != null; i++) {


                        if (cuentasCorrientes[i].getNumeroCuenta().equals(numerocuenta)) {
                            System.out.println(cuentasCorrientes[i].toString());
                            System.out.println("\nPresione Enter para volver al menú");
                            char salir = (char) System.in.read();
                            if (salir == 10) {
                                break;
                            }
                        }

                    }

                    for (int i = 0; i < cuentasAhorro.length && cuentasAhorro[i] != null; i++) {

                        if (cuentasAhorro[i].getNumeroCuenta().equals(numerocuenta)) {
                            cuentasAhorro[i].calcularInteres();
                            System.out.println(cuentasAhorro[i].toString());
                            System.out.println("\nPresione Enter para volver al menú");
                            char salir = (char) System.in.read();
                            if (salir == 10) {
                                break;
                            }

                        }

                    }

                    break;

                case 5:
                    System.out.println("Saliendo...");
                    exit = false;
                    Thread.sleep(1000);
                    break;

                default:
                    System.out.println("No ha insertado una opcion valida");
            }
        }


    }
}
