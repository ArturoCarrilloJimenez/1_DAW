import java.util.Scanner;

public class RuletaPrueba {
    public static void main(String[] args) {
    
        int dinero,numApuesta,inporApuesta;
        String color,continuar;

        Scanner scanner = new Scanner(System.in);
        Ruleta rl = new Ruleta();

        do {
            System.out.println("Cuanto dinero vas a meter (Minimo 1)");
            dinero = scanner.nextInt();
        } while (dinero <= 0);

        rl.setSaldo(dinero);

        System.out.print("Tu saldo es de: " + rl.saldo() + " Euros \n");
        do {
            do {
                System.out.println("A que numero quieres apostar (entre 0 y 36)");
                numApuesta = scanner.nextInt();
            } while ((numApuesta < 0) || (numApuesta > 36));

            scanner.nextLine();
            
            do {
                System.out.println("A que color quieres apostar (rojo o negro)");
                color = scanner.nextLine();
            } while (!color.equals("negro") && !color.equals("rojo"));

            do {
                System.out.println("Cuanto quieres apostar (debe de ser menor o igual a tu saldo)");
                inporApuesta = scanner.nextInt();
            } while (inporApuesta > rl.saldo());

            rl.setApuesta(numApuesta,color,inporApuesta);

            System.out.println("El numero salido es " + rl.numeroColorPremio());
            System.out.print("Tu saldo es de: " + rl.saldo() + " Euros \n");

            scanner.nextLine();

            do {
                System.out.print("Deseas retirar tu dinero (S o N) ");
                continuar = scanner.nextLine();
            } while (!continuar.equals("S") && !continuar.equals("N"));

        } while ((rl.saldo() != 0) && !continuar.equals("S"));

        System.out.println("Has retirado " + rl.saldo() + " Euros");
        scanner.close();
    }
}
