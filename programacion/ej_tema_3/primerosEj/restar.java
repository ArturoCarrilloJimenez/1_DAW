// Este programa realiza restas de numeros enteros
import java.util.Scanner;

public class restar {
    public static void main(String[] args){
    
    int a,b,c;  

    //Creo objeto scanner
    Scanner scanner = new Scanner(System.in);

    //Pregunto los numeros
    System.out.println("Escrive el numero para restar ");
    a = scanner.nextInt();
    System.out.println("Escrive el segundo numero para restar ");
    b = scanner.nextInt();    

    //Realizo resta
    c = a - b;

    //Muestro respuesta
    System.out.println("El resultado es = " + c);

    //Cierro scanner
    scanner.close();
    }
}
