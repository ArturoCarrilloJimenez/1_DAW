import java.util.Scanner;

public class NimPrueba {
    public static void main(String[] args) {
        
        int mont,palillo;
        boolean comprobar;

        Scanner scanner = new Scanner(System.in);
        Nim nim = new Nim();

        System.out.println("Bienvedido al Juego de Nim");

        do {
            // guardo en variable local el array
            int[] montones = nim.mostrarMontones();
                
            // turno = true  ,elige la persona 
            // turno = false ,elige el programa
            if (nim.turno()) {
                // muestro el array
                System.out.println("\nEl contenido actual de los montones es:");
                System.out.println("Monton 1: " + montones[0]);
                System.out.println("Monton 2: " + montones[1]);
                System.out.println("Monton 3: " + montones[2] + "\n");

                do {
                    do {
                        System.out.println("¿De que monton quieres quitar palillos (1, 2 o 3)?");
                        mont = scanner.nextInt();
                    } while ((mont < 1) || (mont > 3));

                    nim.elegirMonton(mont);
                    
                    if (nim.comprobarMonton()) {
                        System.out.println("Error: ese montón ya no tiene palillo");
                    }
                } while (nim.comprobarMonton());

                do {
                    do {
                        System.out.println("¿Cuantos palillos quieres quitar del montón " + mont + " (1 o 2)?");
                        palillo = scanner.nextInt();
                    } while ((palillo < 0) || (palillo > 2));

                    nim.elegirPalillo(palillo);

                    // guardo en una variable local el resultado de este metodo
                    comprobar = nim.comprobarPalillos();

                    if (comprobar) {
                        System.out.println("Error: ese montón no tiene tantos palillo");
                    }
                } while (comprobar);
            }
            else {
                System.out.println("\nEs mi turno...");
                System.out.println("Elijo el montón " + nim.elegirMonton(0));
                System.out.println("Quito " + nim.elegirPalillo(0) + " palillos");
            }
        } while (nim.comprobarFinJuego());

        if (nim.turno() == true) {System.out.println("\nHas ganado");}
        else {System.out.println("A ganado la maquina");}

        scanner.close();
    }
}
