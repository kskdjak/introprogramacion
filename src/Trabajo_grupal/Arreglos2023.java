package Trabajo_grupal;

import java.util.Scanner;

public class Arreglos2023 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero de elemetos");
        int arreglo= entrada.nextInt();
        int[] miarreglo=new int [arreglo];
        metodos.insertar(miarreglo);
        metodos.presentar1(miarreglo);
        System.out.println(" ");

        System.out.println("Ingrese el numero a buscar");
        int buscar= entrada.nextInt();
        metodos.busquedaSeleccion(miarreglo,buscar);
        System.out.println("El numero se encuentra en la posicion: "+ metodos.busquedaSeleccion(miarreglo,buscar));
        System.out.println(" ");

        System.out.println("Ingrese el numero a elimninar");
        int eliminar= entrada.nextInt();
        metodos.eliminar1(miarreglo,eliminar);
        metodos.presentar1(miarreglo);
        System.out.println(" ");

        System.out.println("Ingrese 1 si desea utilizar el ordenamiento burbuja\n");
        System.out.println("Ingrese 2 si desea utilizar el ordenamiento ShellShort");
        int eleccion= entrada.nextInt();
        if (eleccion==1){
            System.out.println("ORDENAMIENTO BURBUJA");
            metodos.brubuja(miarreglo);
            metodos.presentar1(miarreglo);
        } else if (eleccion==2) {
            System.out.println("ORDENAMIENTO SHELLSHORT");
            metodos.shellSort(miarreglo);
            metodos.presentar1(miarreglo);
        }else {
            System.out.println("Eleccion erronea");
        }
    }
}