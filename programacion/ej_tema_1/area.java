// Este programa calculara el area y la longitud de un circulo

import java.util.Scanner;

public class area {
    public static void main(String[] args) {

        double r, longitud, area;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio
        System.out.print("Ingrese el radio del círculo: ");
        r = scanner.nextDouble();

        // Calcula la longitud y area
        longitud = 2 * Math.PI * r;
        area = Math.PI * r * r;

        // Muestra el resultaddo
        System.out.println("La longitud es de " + longitud);
        System.out.println("El area es de " + area);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
