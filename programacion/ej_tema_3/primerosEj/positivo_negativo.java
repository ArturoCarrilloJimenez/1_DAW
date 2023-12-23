//Este programa lee un numero y dice si es positivo o negativo

import java.util.Scanner;

public class positivo_negativo {
    public static void main (String[] args){

        int n;

        //Creo objetos escaner para leer un numero
        Scanner scanner = new Scanner(System.in);

        //Le digo que escriva un numero y lo guarde en n
        System.out.print("Escribe un numero entero : ");
        n = scanner.nextInt();

        //Creo una condicional que mira si es positivo o negativo
        if(n > 0){
            System.out.println("El numero " + n + " es positivo");
        }
        else if(n < 0){
            System.out.println("El numero " + n + " es negativo");
        }
        else{
            System.out.println("El numero " + n + " no es negativo ni positivo");
        }

        //Cierra scanner
        scanner.close();
    }
}
