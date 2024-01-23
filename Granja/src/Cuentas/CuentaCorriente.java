package Cuentas;

public class CuentaCorriente {

    protected Titular titularCuenta;
    private String numeroCuenta;
    private double saldo;


    public CuentaCorriente(Titular titularCuenta, String numeroCuenta, double saldo) {
        this.titularCuenta = titularCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titularCuenta, String numeroCuenta) {
        this.titularCuenta = titularCuenta;
        this.numeroCuenta = numeroCuenta;
        saldo = 1500;
    }

    public Titular getTitularCuenta() {
        return titularCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar (double cantidad){
        saldo = saldo+cantidad;
    }

    public void reintegro (double cantidad){

        setSaldo(saldo-cantidad);
    }
    public boolean compararCuentas(String otroNumeroCuenta){
        int resultado = this.numeroCuenta.compareTo(otroNumeroCuenta);
        boolean respuesta = false;
        if (resultado==0)
            respuesta = true;
        return  respuesta;

    }
    public boolean compararCuentas(String numeroCuenta1, String numeroCuenta2){
        int resultado = numeroCuenta1.compareTo(numeroCuenta2);
        /*boolean respuesta = false;
        if (resultado==0)
            respuesta = true;
        return  respuesta;*/
        //return (resultado==0)?true:false;
        return resultado==0;


    }
    public boolean esIgual(String otroNumeroCuenta){
        return  this.numeroCuenta.equals(otroNumeroCuenta);
    }

    @Override
    public String toString() {
        return "\n\t\t||Datos de su cuenta||\n" +
                "\nEl titular de la cuenta es " + titularCuenta +
                "\nEl numero de cuenta es " + numeroCuenta + ".\n" +
                "El saldo es de " + saldo +
                "€.";
    }
}
