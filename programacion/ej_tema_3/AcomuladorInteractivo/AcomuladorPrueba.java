import java.util.Scanner;

public class AcomuladorPrueba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Acomulador ac = new Acomulador();

        do{
            System.out.println("Escribe un numero");
            int a = scanner.nextInt();

            ac.setNumero(a);
        }
        while(ac.positivo() == true);

        System.out.println(ac.media());
        scanner.close();
    }
}
