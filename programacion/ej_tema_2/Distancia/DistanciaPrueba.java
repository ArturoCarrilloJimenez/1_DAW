import java.util.Scanner;

public class DistanciaPrueba {
    public static void main(String[] args){

        double d;

        Distancia dis = new Distancia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la cantidad que quieras pasar");
        d = scanner.nextDouble();

        dis.setDistancia(d);

        System.out.println(d + " millas son " + dis.millasKilometros() + " kilometros");
        System.out.println(d + " millas son " + dis.millasMetros() + " metros");

    scanner.close();
    }
}
