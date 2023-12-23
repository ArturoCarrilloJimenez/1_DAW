import java.util.Scanner;

public class PesoPrueba {
    public static void main(String[] args){

        double p;
        int t;

        Peso ps = new Peso();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe 1(libras), 2(onzas), 3(kilogramos) o 4(gramos)");
        t = scanner.nextInt();
        System.out.println("Escribe un peso");
        p = scanner.nextDouble();
        
        ps.setTipo(t);
        ps.setPeso(p);

        System.out.println("Son " + ps.pasarLibras() + " libras");
        System.out.println("Son " + ps.pasarKilos() + " Kilos");
        System.out.println("Son " + ps.pasarOnzas() + " Onzas");

        scanner.close();
    }
}
