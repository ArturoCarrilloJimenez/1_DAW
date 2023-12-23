// Te indica si un mumero real tien parte decimal o no

import java.util.Scanner;

public class Parte_decimal {
    public static void main (String[] args){

        double n, b;
        boolean x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        n = scanner.nextDouble();

        b = Math.floor(n);

        if(b == n) x =true;
        else x = false;

        if(x)System.out.println("No tiene parte decimal");
        else System.out.println("Tiene parte decimal");

        scanner.close();
    }
}
