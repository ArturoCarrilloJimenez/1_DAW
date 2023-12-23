import java.util.Scanner;

public class CambioPrueba {
    public static void main(String[] args){
        
        Cambio cb = new Cambio();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cuanto quieres cambiar");
        double a = scanner.nextDouble();

        cb.setCambio(a);

        System.out.println("Aqui tienes tu cambio");
        System.out.println(cb.getCambio());
        
        scanner.close();
    }
}
