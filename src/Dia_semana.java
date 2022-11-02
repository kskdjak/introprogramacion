import java.util.Scanner;

public class Dia_semana {
    public static void main(String[] args) {
        System.out.println("Ingresar el valor del 1 al 7");
        Scanner teclado=new Scanner(System.in);
        int n=teclado.nextInt();
        if(n==1)
            System.out.println("Lunes");
        else if (n==2)
            System.out.println("Martes");
        else if (n==3)
            System.out.println("Miercoles");
        else if (n==4)
            System.out.println("Jueves");
        else if (n==5)
            System.out.println("Viernes");
        else if (n==6)
            System.out.println("Sabado");
        else if (n==7)
            System.out.println("Domingo");
        else
            System.out.println("Error");
    }
}
