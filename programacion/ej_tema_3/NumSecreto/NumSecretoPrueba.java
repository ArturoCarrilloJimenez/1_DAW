import java.util.Scanner;

public class NumSecretoPrueba {
    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);
        NumSecreto ns = new NumSecreto();

        do {
            do {
                System.out.println("Escribe un numero entre 1 y 100");
                a = scanner.nextInt(); 
            } while ((a < 1) || (a > 100));
           

            ns.setNumero(a);

            if (ns.validarNum() == false) {
                System.out.println("El numero secreto es " + ns.mayorMenor());
            }

        } while (ns.validarNum() == false);

        System.out.println("Felicidades, has acertado el numero secreto con " + ns.intentos() + " intentos");
        
        scanner.close();
    }
}
