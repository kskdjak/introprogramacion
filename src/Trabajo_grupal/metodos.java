package Trabajo_grupal;

import java.util.Scanner;


public class metodos {
    public  static void insertar(int[]x){
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Ingrese elemento de posicion "+i+":");
            x[i]=entrada.nextInt();
        }
    }
    public static void presentar1(int[]x){
        String coma=" ";
        for (int i = 0; i < x.length; i++) {
            System.out.print(coma+x[i]);
            coma=",";
        }
        System.out.println("");
    }
    public static int busquedaSeleccion(int[]x, int num){
        for (int i = 0; i < x.length; i++) {
            if(x[i]==num)
                return  i;
        }
        return -1;
    }
    public static void eliminar1(int []x,int num){

        int pos =busquedaSeleccion(x,num);
        if (pos!=-1){
            for (int i = pos; i < x.length-1; i++) {
                x[i]=x[i+1];
            }
            x[x.length-1]=0;
        }else
            System.out.println("Elemento no existe....");
    }
    public static void brubuja(int[]x){
        int n = x.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (x[j] > x[j+1]) {
                    // Intercambiar elementos
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
    public static void shellSort(int[]x) {
        int n = x.length;
        // Seleccionar el tamaño del paso inicial
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        // Realizar el ordenamiento por incrementos decrecientes
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && x[j] < x[j - h]; j -= h) {
                    // Intercambiar los elementos
                    int temp = x[j];
                    x[j] = x[j - h];
                    x[j - h] = temp;
                }
            }
            // Reducir el tamaño del paso
            h /= 3;
        }
    }


}