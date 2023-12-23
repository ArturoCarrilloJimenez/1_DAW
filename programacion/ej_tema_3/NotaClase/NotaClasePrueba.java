import java.util.Scanner;

public class NotaClasePrueba {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        NotaClase nc = new NotaClase();

        int i = 0;

        // este bucle hace que escribas las 30 notas y las mada a el servidor
        do{
            System.out.println("Escribe una nota");

            double n = scanner.nextDouble();
            
            // este otro bucle comprueva que sea mayor de 1 y menor de 10 si no es asi te obliga a escribir otro numero
            while((n < 1) | (n > 10)){
                System.out.println("Error, solo se pueden introducir numeros del 1 al 10");
                n = scanner.nextDouble();
            }

            nc.setNumero(n);

            i++;
        }
        while(i<30);

        System.out.println("Ay " + nc.getNumAprobados() + " aprobados y " + nc.getNumSuspensos() + " suspensos");
        scanner.close();
    }
}
