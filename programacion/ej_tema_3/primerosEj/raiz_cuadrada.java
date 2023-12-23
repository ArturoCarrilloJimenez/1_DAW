//Este programa realiza la raiz cuadrada de un mumero

import java.util.Scanner;

public class raiz_cuadrada {
    public static void main (String[] args){

    // Defino el tipo de dato
    double n;

    //Creo objetos escaner para leer un numero
    Scanner scanner = new Scanner(System.in);

    //Le digo que escriva un numero y lo guarde en n. Este se ejecutara asta que el numero sea positivo (Los numeros negativo no tienen raiz)
    do{
        System.out.println("Escribe un numero para calcular la raiz cuadrada");
        n = scanner.nextDouble();
        if(n < 0){
            System.out.println("Eror,solo se pueden escribir numero enteroos");
        }
    } while(n < 0.0);

    //Calcula el radio y lo guarda en r
    double raiz = Math.sqrt(n);

    //Muestra el resultado
    System.out.println("La raiz cuadrada de " + n + " es " + raiz);

    //Cierra scanner
    scanner.close();
    }
}
