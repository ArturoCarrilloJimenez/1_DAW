import java.util.Scanner;

public class InvertirCadena {
    public String invertir(String original) {
        StringBuilder cadena = new StringBuilder();

        for (int i = (original.length() - 1);i >= 0;i--) {
            
            cadena.append(original.charAt(i));
        }
        return cadena.toString();
    }
    public static void main(String[] args) {
        InvertirCadena inversor = new InvertirCadena();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una cadena");
        String original = scanner.nextLine();

        String invertido = inversor.invertir(original);

        System.out.println(invertido);
        scanner.close();
    }
}
