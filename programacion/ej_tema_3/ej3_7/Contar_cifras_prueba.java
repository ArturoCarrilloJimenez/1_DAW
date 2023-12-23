//Este programa muestra el resultado de el algoridmo contar cifras y hace que solo puedas poner numeros con 5 cifras como maximo
import java.util.Scanner;

public class Contar_cifras_prueba{
    public static void main (String[] args){

        Contar_cifras pd = new Contar_cifras();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Escribe un numero de 5 cifras");
            pd.n = scanner.nextInt();
        }
        while(pd.n>= 100000 || pd.n<= -100000);

        if(pd.contarCifra() == 5)System.out.println("Tene 5 cifras");
        else if(pd.contarCifra() == 4)System.out.println("Tene 4 cifras");
        else if(pd.contarCifra() == 3)System.out.println("Tene 3 cifras");
        else if(pd.contarCifra() == 2)System.out.println("Tene 2 cifras");
        else if(pd.contarCifra() == 1)System.out.println("Tene 1 cifras");

        scanner.close();
    }
}