import java.util.Scanner;

public class GoldbachPrueba {
    public static void main(String[] args) {
        
        int n;

        Goldbach gb = new Goldbach();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escribe un numero mayor que 4");
            n = sc.nextInt();
        } while (n < 4);

        System.out.println(gb.suma(n));
        sc.close();
    }
}
