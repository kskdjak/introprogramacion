public class Hospital {

    private String nombreHospital;
    private String ciudadHospital;
    private int numeroCamas;
    private int numeroDoctores;
    private double presupuestoAnual;

    // constructores
    // Objetos para opción 1
    public Hospital(String nombreHospital, int numeroCamas, int numeroDoctores, double presupuetoAnual){
        this.nombreHospital = nombreHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.presupuestoAnual = presupuetoAnual;
        this.ciudadHospital="QUITO";

        // para este tipo de hospitales la ciudad por defecto será Quito
    }

    // Objetos para opción 2
    public Hospital(String ciudadHospital, int numeroCamas, int numeroDoctores) {
        this.nombreHospital ="QUITO";
        this.ciudadHospital = ciudadHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.presupuestoAnual = 250000.10;
    }
    // Objetos para opción 3

    public Hospital(String nombreHospital, String ciudadHospital, int numeroCamas, int numeroDoctores, double presupuestoAnual) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = ciudadHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.presupuestoAnual = presupuestoAnual;
    }

    // métodos establecer para asignar valores a
    // cada atributo
    public void establecerNombreHospital(String n){
        nombreHospital = n;
    }

    public void establecerCiudadHospital(String n){
        ciudadHospital = n;
    }

    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }

    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }

    public void establecerPresupuestoAnual(double n){
        presupuestoAnual = n;
    }

    // métodos obtener, que permitan acceder a los valores de
    // cada atributo

    public String obtenerNombreHospital(){
        return nombreHospital;
    }

    public String obtenerCiudadHospital(){
        return ciudadHospital;
    }

    public int obtenerNumeroCamas(){
        return numeroCamas;
    }

    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }

    public double obtenerPresupuestoAnual(){
        return presupuestoAnual;
    }

    @Override
    public String toString() {
        return "Hospital{\n" +
                "nombreHospital=" + nombreHospital + "\n" +
                "ciudadHospital=" + ciudadHospital + "\n" +
                "numeroCamas=" + numeroCamas +"\n"+
                "numeroDoctores=" + numeroDoctores +"\n"+
                "presupuestoAnual=" + presupuestoAnual +"\n"+
                '}';
    }
}
