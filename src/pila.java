import java.util.Scanner;


    class clasePilaArray{
        int[] PILA;
        int TOPE;
        int MAX;
        Scanner teclado=new Scanner(System.in);
        public clasePilaArray(int MAX){
            this.TOPE=-1;
            this.MAX=MAX;
            this.PILA=new int[this.MAX];
        }
        public int getTOPE() {
            return TOPE;
        }
        public void vaciarPIla(){
            this.TOPE=-1;
        }
        public boolean PilaLlena(){
            if (this.MAX-1==this.TOPE){
                return true;
            }else {
                return false;
            }
        }
        public boolean PilaVacia(){
            if (this.TOPE==-1){
                return true;
            }else {
                return false;
            }
        }
        public void InsertarPila(){
            if (this.PilaLlena()){
                System.out.printf("Píla llena");
            }else {
                int ITEM;
                System.out.println("Ingrese el item a insertar");
                ITEM= teclado.nextInt();
                this.TOPE++;
                this.PILA[this.TOPE]=ITEM;
                System.out.println("El item"+ITEM+"se ha insertado");
            }
        }
        public void EliminarPila(){
            if (this.PilaVacia()){
                System.out.println("Pila Vacia");
            }else {
                int ITEM=this.PILA[this.TOPE];
                this.TOPE--;
                System.out.println("El item"+ITEM+"se ha eliminado");
            }
        }
        public void ImprimirPila(){
            for (int i = 0; i <TOPE; i++) {
                System.out.println("El arreglo es: "+i);
                System.out.println(PILA[i]);

            }
        }
    }
public class pila {
    public static void   main(String[] args) {
        clasePilaArray pila=new clasePilaArray(5);
        pila.InsertarPila();
        pila.InsertarPila();

        pila.ImprimirPila();
    }
}
