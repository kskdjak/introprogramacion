import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code



public class Main {
   public static void matriz(int mat[][]) {
      for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
            System.out.println(mat[i][j]+" ");
            System.out.println();
         }
      }
   }
   public static void presentar(int mat[][]){
      for (int i = 0; i <mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
            System.out.print(mat[i][j]+" ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args) {

      Scanner teclado=new Scanner(System.in);
      System.out.println("introduzca las dimenciones");
      int filas= teclado.nextInt();
      int colum= teclado.nextInt();
      /*
      Scanner teclado=new Scanner(System.in);
      System.out.println("introduzca las dimenciones");
      int filas= teclado.nextInt();
      int colum= teclado.nextInt();
      int [][] mimatriz=new int[filas][colum];
      for (int i = 0; i < mimatriz.length; i++) {
         for (int j = 0; j < mimatriz[i].length; j++) {
            System.out.println("Ingrese el numero en la posicion: "+i+" "+j);
            mimatriz[i][j]= teclado.nextInt();
         }
      }
      for (int i = 0; i < mimatriz.length; i++) {
         for (int j = 0; j < mimatriz[i].length; j++) {
            System.out.print(mimatriz[i][j]+" ");
         }
         System.out.println();
      }
      */
   }
}


