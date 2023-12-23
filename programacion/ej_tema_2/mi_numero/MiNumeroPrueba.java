import java.util.Scanner;

public class MiNumeroPrueba {
    public static void main(String[] args){

        int n1, n2;

        //Llamo al programa MiNumero y al Scanner
        MiNumero miNum = new MiNumero();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        n1 = scanner.nextInt();

        System.out.println("Introduce un segundo numero para sumor y restar al primero");
        n2 = scanner.nextInt();

        //Manda n1 y n2 a MiNumero para guardarlo en las variables de ese programa
        miNum.setNumero1(n1);
        miNum.setNumero2(n2);

        //Muestra resultado
        System.out.println("El doble de el numero " + n1 + " es " + miNum.dobleNumero());
        System.out.println("El triple de el numero " + n1 + " es " + miNum.tripleNumero());
        System.out.println("El cuadruple de el numero " + n1 + " es " + miNum.cuadrupeNumero());
        System.out.println("La suma de " + n1 + " y " + n2 + " es " + miNum.sumaNumeros());
        System.out.println("La resta de " + n1 + " y " + n2 + " es " + miNum.restaNumeros());

        scanner.close();
    }
}
