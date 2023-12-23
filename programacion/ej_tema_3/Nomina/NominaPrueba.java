import java.util.Scanner;

public class NominaPrueba {
    public static void main(String[] args){

        Nomina nm = new Nomina();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cuanto cobras una hora normal");
        int d = scanner.nextInt();

        System.out.println("Cuantas horas has echado");
        double h = scanner.nextDouble();

        nm.setNumero(d, h);

        System.out.println("El salario bruto es = " + nm.sueldoBruto());
        System.out.println("El salario neto es = " + nm.sueldoNeto());

        scanner.close();
    }
}
