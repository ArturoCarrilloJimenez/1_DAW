// Programa de prueba de los patrones
import java.util.Scanner;

public class PatronesPrueba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Patrones pt = new Patrones();

        System.out.println("Escribe la altura que tenga el triangulo");
        int altTri = scanner.nextInt();

        pt.setAlturaTrian(altTri);

        System.out.println("Triangulo");
        System.out.println(pt.triangulo());

        System.out.println("Escribe un numero, cuanto mas grande sea mas grande ara el rombo");
        int altRombo = scanner.nextInt();

        pt.setAltRombo(altRombo);

        System.out.println("Rombo");
        System.out.println(pt.rombo());
        scanner.close();
    }
}
