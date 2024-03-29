public class Vendedor {

    private String nombres;
    private int edad;
    private double pagoMensual;
    private double salarioMinimo;
    private int numeroAutos;
    private double comisionPorAuto;

    public Vendedor(String n, int e, double sMinimo, int nAutos) {
        nombres = n;
        edad = e;
        salarioMinimo = sMinimo;
        establecerNumeroAutos(nAutos);
        comisionPorAuto = 150;
    }

    public void establecerNombres(String c) {
        nombres = c;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public void calcularPagoMensual() {
        pagoMensual = obtenerSalarioMinimo()
                + (obtenerComisionPorAuto() * obtenerNumeroAutos());
    }

    public void establecerSalarioMinimo(double s) {
        salarioMinimo = s;
    }

    public void establecerNumeroAutos(int s) {
        numeroAutos = s;
    }

    // comisionPorAuto;
    public void establecerComisionPorAuto(double s) {
        comisionPorAuto = s;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public int obtenerEdad() {
        return edad;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public double obtenerSalarioMinimo() {
        return salarioMinimo;
    }

    public int obtenerNumeroAutos() {
        return numeroAutos;
    }

    public double obtenerComisionPorAuto() {
        return comisionPorAuto;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", pagoMensual=" + pagoMensual +
                ", salarioMinimo=" + salarioMinimo +
                ", numeroAutos=" + numeroAutos +
                ", comisionPorAuto=" + comisionPorAuto +
                '}';
    }
}