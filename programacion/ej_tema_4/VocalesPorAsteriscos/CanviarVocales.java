import java.util.Scanner;

public class CanviarVocales {

    public String canviarVocales(String original) {
        char[] remplazar = {'a','e','i','o','u','A','E','I','O','U'}; 
        
        for (int i = 0;i < remplazar.length;i++) {
            original = original.replace(remplazar[i], '*');
        }

        return original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CanviarVocales cv = new CanviarVocales();

        System.out.println("Escribe una cadena");
        String cadena = scanner.nextLine();

        cadena = cv.canviarVocales(cadena);

        System.out.println(cadena);
        scanner.close();
    }
}