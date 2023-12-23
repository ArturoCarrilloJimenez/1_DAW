import java.util.Scanner;

public class FibonacciPrueba {
    public static void main(String[] args){

        int a,i;
        
        Scanner scanner = new Scanner(System.in);
        Fibonacci  fb = new Fibonacci();

        do{
            System.out.println("Introduce cuantos numeros quieres mostrar (minimo deve de ser 2)");
            a = scanner.nextInt();
        }
        while(a <= 1);

        fb.setNumero(a);

        i = 0;
        int[] fibonacciArray = fb.getFibonacci(); // guardo el metodo en un array para poder mostrarlo

        System.out.println("Aqui tienes la secuencia de numeros de fibonacci");
        while (i < a){
            System.out.println(fibonacciArray[i]);
            i++;
        }
        
    scanner.close();
    }
}
