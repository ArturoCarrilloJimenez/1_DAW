import java.util.Scanner;

public class EstadisticaPrueba {
    public static void main(String[] args) {
       
        int n;

        Scanner sc = new Scanner(System.in);
        Estadistica es = new Estadistica();

        for (int i = 0;i < es.LONG;i++) {
            System.out.println("Escribe un numero entero positivo");
            do {
                n = sc.nextInt();
            } while (n < 0);
            es.setNumero(n);
        }

        System.out.println("La media es de " + es.media());

        System.out.println("Estos son los numeros por devajo de la media");
        System.out.println(es.menorMedia());

        System.out.println("Estos son los numeros por encima de la media");
        System.out.println(es.mayorMedia());

        sc.close();
    }
}
