import java.util.Scanner;

public class BuscarArrayPrueba {
    public static void main(String[] args) {
        
        BuscarArray ba = new BuscarArray();
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero que quieras buscar");
        int num = sc.nextInt();

        int[] a = ba.ordenarArray();

        for (int i = 0;i < ba.LONG;i++) {
            System.out.print(a[i] + " - ");
        }
        
        int busqueda = ba.buscar(num);

        if (busqueda == -1) {
            System.out.println("\nError, ese numero no se encuentra en el array");
        }
        else {
            System.out.println("\nEl numero esta en la posicion " + busqueda);
        }
        sc.close();
    }
}
