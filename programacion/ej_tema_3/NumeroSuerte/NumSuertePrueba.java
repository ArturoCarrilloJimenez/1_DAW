import java.util.Scanner;

public class NumSuertePrueba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        NumSuerte ns = new NumSuerte();

        System.out.println("Introduce el dia en el que naciste");
        int d = scanner.nextInt();

        System.out.println("Introduce el mes en numero de tu fecha de nacimeinto");
        int m = scanner.nextInt();

        System.out.println("Introduce en el año en el que naciste");
        int a = scanner.nextInt();

        ns.setNumero(d,m,a);

        System.out.println("Tu numero de la suerte es " + ns.descomponerNum());
        scanner.close();
    }
}
