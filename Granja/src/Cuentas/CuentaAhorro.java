package Cuentas;

public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(Titular titularCuenta, String numeroCuenta, double saldo, double interes) {
        super(titularCuenta, numeroCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titularCuenta, String numeroCuenta, double interes) {
        /*super(titularCuenta, numeroCuenta,15.3);
        this.interes=interes;*/
        this(titularCuenta, numeroCuenta, 15.3, interes);

    }

    public CuentaAhorro(Titular titularCuenta, String numeroCuenta) {
       /* super(titularCuenta,numeroCuenta);
        setSaldo(15.5);
        interes=2.5;*/
        this(titularCuenta, numeroCuenta, 15.3, 2.5);
    }


    public double getInteres() {
        return interes;
    }


    public void calcularInteres() {

        int contador = 0;
        contador++;
        double total_Interes = 0;
        for (int i = 0; i < contador; i++) {
            total_Interes = total_Interes + (getSaldo() * this.interes / 100);
        }
        setSaldo(getSaldo() + total_Interes);
    }
    public double calcularInteresPuntual(){
        return interes*getSaldo()/100+getSaldo();

    }


    @Override
    public String toString() {
        return super.toString() + "\nEl interes de la cuenta es del " + interes + "%.";
    }
}
