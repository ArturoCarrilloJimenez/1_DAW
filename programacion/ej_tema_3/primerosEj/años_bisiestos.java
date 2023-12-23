//Este programa dice si un año es bisiesto o no

import java.util.Scanner;

public class años_bisiestos {
    public static void main (String[] args){

        int a, divisible_4, divisible_100, divisible_400;
        
        //Creo objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Pregunto el año
        System.out.println("Introduce un año ");
        a = scanner.nextInt();

        //Realiza operaciones
        divisible_4 = a % 4;
        divisible_100 = a % 100;
        divisible_400 = a % 400;

        //Realiza condicional
        if(divisible_4 != 0){
            System.out.println("No es bisiesto");
        }
        if((divisible_4 == 0) && (divisible_400 == 0)){
            System.out.println("Es bisiesto");
        }
        else if((divisible_4 == 0) && (divisible_100 == 0)){
            System.out.println("No es bisiesto");
        }
        else if(divisible_4 == 0){
            System.out.println("Es bisiesto");
        }
    
        
        //Cierro scanner
        scanner.close();
    }
}
