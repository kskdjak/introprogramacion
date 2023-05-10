import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // objeto que permite ingresar datos por teclado
        Scanner entrada = new Scanner(System.in);

        // varibles para almacenar valores ingresados por teclado
        String nombreHospital;
        String ciudadDeHospital;
        int numeroDeCamas;
        int numeroDeDoctores;
        double presupuestoAnio;
        int opcion;

        // Proceso de discriminación en función de la opción que 
        // selecciona el usuario
        System.out.println("Que tipo de hospital desea ingesar\nOpción 1"
                + "\nOpción 2\nOpción 3");
        opcion = entrada.nextInt();

        entrada.nextLine(); // limpiar el buffer 

        // Uso de condicionales compuestos
        if (opcion == 1) {
            System.out.println("INGRESE nombHospital, #CAMAS, #DOC, PRESUPUESTO");
            Hospital hosp1 = new Hospital(entrada.next(), entrada.nextInt(), entrada.nextInt(), entrada.nextDouble());
            System.out.println(hosp1);
            entrada.nextLine();
        } else if (opcion == 2) {
            System.out.println("INGRESE nombHospital, #CAMAS, #DOC");
                Hospital hosp2 = new Hospital(entrada.next(), entrada.nextInt(), entrada.nextInt());
                System.out.println(hosp2);
            entrada.nextLine();
            } else if (opcion == 3) {
            System.out.println("INGRESE nombHospital,ciudad, #CAMAS, #DOC, PRESUPUESTO");
                    Hospital hosp3 = new Hospital(entrada.next(), entrada.next(), entrada.nextInt(),entrada.nextInt(),entrada.nextDouble());
                    System.out.println(hosp3);
            entrada.nextLine();
                } else {
                    System.out.println("Opción fuera de rango");
        }
    }
}

