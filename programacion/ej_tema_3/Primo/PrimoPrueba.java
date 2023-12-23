import java.util.Scanner;

public class PrimoPrueba {
    public static void main(String[] args){

        int a;

        Scanner scanner = new Scanner(System.in);
        Primo pr = new Primo();

        do{
            System.out.println("Escribe el numero que quieras (Minimo el numero 1)");
            a = scanner.nextInt();
        }
        while(a <= 0);

        pr.setNumero(a);

        if (pr.getPrimo()) {System.out.println("Este numero es primo");}
        else {System.out.println("Este  numero no es primo");}

        scanner.close();
    }
}
