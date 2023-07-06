abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String cedula;
    private String direccion;
    private int antiguedad;
    private String telefono;

    public Empleado(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
    }

    public abstract double calcularSalario();

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Cédula: " + cedula);
        System.out.println("Dirección: " + direccion);
        System.out.println("Antigüedad: " + antiguedad + " años");
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: $" + calcularSalario());
        System.out.println("------------------------------");
    }
}

class Secretario extends Empleado {
    private String despacho;
    private int horasLaboradas;
    private double costoHora;

    public Secretario(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono,
                      String despacho, int horasLaboradas, double costoHora) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono);
        this.despacho = despacho;
        this.horasLaboradas = horasLaboradas;
        this.costoHora = costoHora;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = horasLaboradas * costoHora;
        double horasExtra = Math.max(horasLaboradas - 40, 0);
        double salarioExtra = horasExtra * costoHora * 1.5;
        return salarioBase + salarioExtra;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Despacho: " + despacho);
        System.out.println("Horas laboradas: " + horasLaboradas);
        System.out.println("Costo hora: $" + costoHora);
        System.out.println("Salario total: $" + calcularSalario());
        System.out.println("------------------------------");
    }
}

class Vendedor extends Empleado {
    private String coche;
    private String matricula;
    private String marca;
    private String modelo;
    private String telefonoMovil;
    private String areaVenta;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono,
                    String coche, String matricula, String marca, String modelo, String telefonoMovil,
                    String areaVenta, double porcentajeComision) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono);
        this.coche = coche;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        double salarioBasico = 1500.0; // Salario básico mensual
        double comisiones = salarioBasico * porcentajeComision; // Cálculo de las comisiones
        return salarioBasico + comisiones;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Coche asignado: " + coche);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Teléfono móvil: " + telefonoMovil);
        System.out.println("Área de venta: " + areaVenta);
        System.out.println("Porcentaje de comisiones: " + (porcentajeComision * 100) + "%");
        System.out.println("Salario total: $" + calcularSalario());
        System.out.println("------------------------------");
    }
}

class JefeDeZona extends Empleado {
    private Secretario secretario;
    private Vendedor[] vendedores;

    public JefeDeZona(String nombre, String apellidos, String cedula, String direccion, int antiguedad, String telefono,
                      Secretario secretario, Vendedor[] vendedores) {
        super(nombre, apellidos, cedula, direccion, antiguedad, telefono);
        this.secretario = secretario;
        this.vendedores = vendedores;
    }

    @Override
    public double calcularSalario() {
        double salarioSecretario = secretario.calcularSalario(); // Salario del secretario
        double totalVentas = 0.0;

        for (Vendedor vendedor : vendedores) {
            totalVentas += vendedor.calcularSalario(); // Acumulación de las comisiones de los vendedores
        }

        return salarioSecretario + (totalVentas * 0.1); // Salario del secretario + 10% de bonificación
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Información del secretario:");
        secretario.imprimirInformacion();
        System.out.println("Información de los vendedores a cargo:");
        for (Vendedor vendedor : vendedores) {
            vendedor.imprimirInformacion();
        }
        System.out.println("Salario total (incluyendo secretario y vendedores): $" + calcularSalario());
        System.out.println("------------------------------");
    }
}

public class Poo {

    public static void main(String[] args) {
        Secretario secretario = new Secretario("Juan", "Perez", "123456789", "Calle 123", 5, "1234567890",
                "Despacho 1", 45, 10.0);
        Vendedor vendedor1 = new Vendedor("Maria", "Lopez", "987654321", "Calle 456", 3, "9876543210",
                "Coche 1", "ABC123", "Ford", "Focus", "9876543210", "Zona A", 0.05);
        Vendedor vendedor2 = new Vendedor("Carlos", "Gomez", "654321987", "Calle 789", 2, "7896543210",
                "Coche 2", "XYZ456", "Chevrolet", "Cruze", "7896543210", "Zona B", 0.03);
        JefeDeZona jefeDeZona = new JefeDeZona("Luis", "Ramirez", "321654987", "Calle 987", 7, "3216549870",
                secretario, new Vendedor[]{vendedor1, vendedor2});

        // Imprimir información de los empleados
        System.out.println("Información del secretario:");
        secretario.imprimirInformacion();
        System.out.println("Información de los vendedores:");
        vendedor1.imprimirInformacion();
        vendedor2.imprimirInformacion();
        System.out.println("Información del jefe de zona:");
        jefeDeZona.imprimirInformacion();
    }
}
