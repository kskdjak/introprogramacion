import java.util.Scanner;

public class llamdado {

    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);

        // Inicio de proceso iterativo 
        bandera = true;
        while (bandera) { // bandera == true
            System.out.println("Ingrese nomVendedor,edad,salariomini,autosVendidos");
            Vendedor vendedor1=new Vendedor(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.nextInt());
            // con los datos ingresados se crea el objeto de tipo Vendedor
            vendedor1.calcularPagoMensual();
            System.out.println(vendedor1);
            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + "salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }
    }
}