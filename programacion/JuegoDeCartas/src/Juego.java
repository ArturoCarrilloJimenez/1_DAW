import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    private static Scanner scanner = new Scanner(System.in);
    private static Baraja baraja;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nELIGE UNA OPCIÓN:");
            System.out.println("1. Carta mas alta\n");

            opcion = elegirOpcion();

            switch (opcion) {
                case 1:
                    cartaAlta();
                    break;
                default:
                    break;
            }

        } while (opcion != 0);
    }

    //Valida que el dato introducido sea un numero
    public static int escribirNumero() {
        int n = -1;
        
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
            scanner.nextLine();
        }

        return n;
    }

    //El usuario elige la opcion
    public static int elegirOpcion() {
        int opciones = -1;

         do {
            System.out.println("Que opocion quieres ejecutar");
            
            opciones = escribirNumero();

            //Mensaje de error si no ay ninguna opcion con ese numero
            if ((opciones < 0) || (opciones > 1)) {
                System.out.println("Error, solo se pueden elegir las opciones mostradas anteriormente");
            }
        } while ((opciones < 0) || (opciones > 1));

        return opciones;
    }

    //Crear baraja y barajar
    public static void crarBaraja() {
        System.out.println("\nDe que tipo quieres crear la baraja");
        System.out.println("1- Baraja de poker");
        System.out.println("2- Baraja española");
        System.out.println("3- Baraja alemana\n");

        int tipo;

        do {
            System.out.println("Elige uno de las opciones anteriores");
            tipo = escribirNumero();
        } while ((tipo < 1) || (tipo > 3));

        baraja = new Baraja(tipo);

        baraja.barajar();
    }

    //Opcion 1 Carta mas alta
    //Este juego hay dos juagadores sacando cada una una carta y este va comparando la mayor
    //El juego acaba cuando no quedan cartas suficientes
    //Gana el jugador que mas cartas altas alla optenido a lo largo de la partida
    public static void cartaAlta() {
        int puntosJ1 = 0,puntosJ2 = 0;
        Carta j1,j2;
        crarBaraja();

        do {
            System.out.println("\nJugador 1");
            j1 = baraja.siguiente();
            System.out.println(j1.toString());

            System.out.println("Jugador 2");
            j2 = baraja.siguiente();
            System.out.println(j2.toString());

            if (j1.mayorQue(j2)) {
                System.out.println("\nJugador 1 ha Ganado");
                puntosJ1++;
            } else {
                System.out.println("\nJugador 2 ha Ganado");
                puntosJ2++;
            }
        } while (baraja.numCartas() >= 2);

        System.out.println("\nJugador 1: " + puntosJ1);
        System.out.println("Jugador 2: " + puntosJ2);

        if (puntosJ1 == puntosJ2) {
            System.out.println("\nLos dos jugadores han empatado");
        } else if (puntosJ1 > puntosJ2) {
            System.out.println("\nHa ganado Jugador 1");
        } else {
            System.out.println("\nHa ganado Jugador 2");
        }
    }
}
