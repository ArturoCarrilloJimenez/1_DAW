import java.util.Scanner;

public class AdivinanzaPrueba {
    public static void main(String[] args) {

        Adivinanza adivina = new Adivinanza();
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Introduce que numero cres que saldra (del 0 al 9)");
        int numUsuario = scanner.nextInt();

        if (adivina.equals(numUsuario)) {
            System.out.println("Enhorabuna lo has adivinado");
        }
        else {System.out.println("Lo sinto, otra vez sera");}

        System.out.println("El numero es " + adivina.getNumeroAleatorio());
        scanner.close();
    }
}
