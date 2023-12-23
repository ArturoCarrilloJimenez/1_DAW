//Clase prueba con setters

import java.util.Scanner;

public class ConversorDivisaPrueba {
    public static void main (String[] args){

        double e, l;

        ConversorDivisa conDiv;
        ConversorDivisa convDiv = new ConversorDivisa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de euros");
        e = scanner.nextInt();
        
        System.out.println("Introduce la cantidad de libras");
        l = scanner.nextInt();

        convDiv.setEuros(e);        
        convDiv.setLibras(l);

        System.out.println(e + " Euros son " + convDiv.euroToLibra() + " Libras");
        System.out.println(l + " Libras son " + convDiv.librasToEuro() + " Euros");
    
        scanner.close();
    }
}
