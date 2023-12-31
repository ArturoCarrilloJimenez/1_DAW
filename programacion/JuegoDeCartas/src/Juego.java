import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    private static Scanner scanner = new Scanner(System.in);
    private static Baraja baraja;

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nELIGE UNA OPCIÓN:");
            System.out.println("1. Carta mas alta");
            System.out.println("2. Brisca");
            System.out.println("0. Salir del juego\n");

            opcion = elegirOpcion();

            switch (opcion) {
                case 1:
                    cartaAlta();
                    break;
                case 2:
                    brisca();
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
            if ((opciones < 0) || (opciones > 2)) {
                System.out.println("Error, solo se pueden elegir las opciones mostradas anteriormente");
            }
        } while ((opciones < 0) || (opciones > 2));

        return opciones;
    }

    //Elegir tipo
    public static void elegirTipo() {
        System.out.println("\nDe que tipo quieres crear la baraja");
        System.out.println("1- Baraja de poker");
        System.out.println("2- Baraja española");
        System.out.println("3- Baraja alemana\n");

        int tipo;

        do {
            System.out.println("Elige uno de las opciones anteriores");
            tipo = escribirNumero();
        } while ((tipo < 1) || (tipo > 3));

        crarBaraja(tipo);
    }

    //Crear baraja y barajar
    public static void crarBaraja(int tipo) {
        baraja = new Baraja(tipo);
        baraja.barajar();
    }

    //Inicializa cartas con la sigiente de la baraja
    public static void inicializarCartas(Carta[] cartasJuego) {
        for (int i = 0;i < cartasJuego.length;i++) {
            cartasJuego[i] = baraja.siguiente();
        }
    }

    //Retorna la sigiente carta de la baraja
    public static Carta cartaSigiente() {
        return baraja.siguiente();
    }

    //Opcion 1 Carta mas alta
    //Este juego hay dos juagadores sacando cada una una carta y este va comparando la mayor
    //El juego acaba cuando no quedan cartas suficientes
    //Gana el jugador que mas cartas altas alla optenido a lo largo de la partida
    public static void cartaAlta() {
        int puntosJ1 = 0,puntosJ2 = 0;
        Carta j1,j2;

        elegirTipo();

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

    //Opcion 2 Brisca
    //Se reparten 3 cartas a cada jugador y se saca una muestra
    //En cada ronda cada jugador elige una carta y gana el que moyor valor tenga del mismo palo o tenga una carta del palo de la muestra
    //Cada jugador tiene que seguir las reglas del brisca para poder ganar
    //Gana la partida el que mas puntos tenga
    public static void brisca() {
        crarBaraja(2);

        //Si turno es true es el jugador, si el false es el programa
        boolean turno = true,primeroElegir = true;
        int ronda = 1,cartaElegidaJugador = 0,cartaElegidaPrograma = 0;
        Carta muestra = baraja.siguiente();
        Carta[] cartasJugador = new Carta[3];
        Carta[] cartasPrograma = new Carta[3];

        inicializarCartas(cartasJugador);
        inicializarCartas(cartasPrograma);

        do {
            System.out.println("\nRonda " + ronda);
            System.out.println("Muestra: "+muestra.toString());
            
            System.out.println("\nTus cartas");
            for (int i = 0;i < cartasJugador.length;i++) {
                System.out.println((i + 1) + " - " + cartasJugador[i].toString());
            }

            int elegir = 0;

            do {
                if (turno) { //Elige el jugador
                    System.out.println("\nQue cartas quieres elegir");

                    do {
                        System.out.println("Elige una de tus cartas");
                        cartaElegidaJugador = escribirNumero();
                    } while ((cartaElegidaJugador < 1) || (cartaElegidaJugador > 3));

                    //Le resto 1 para que funcione de manera correcta el array
                    cartaElegidaJugador--;

                    //El que primero elige canvia el validador
                    if (elegir == 0) {
                        primeroElegir = true;
                    }

                    turno = false;
                } else { //Elige el programa
                    System.out.println("\nEl programa ha elegido esta carta");

                    cartaElegidaPrograma = (int)(Math.random()*3); //Elige una carta aleatoria
                    System.out.println(cartasPrograma[cartaElegidaPrograma].toString());

                    //El que primero elige canvia el validador
                    if (elegir == 0) {
                        primeroElegir = false;
                    }

                    turno = true;
                }

                elegir++;
            } while (elegir == 1);

            turno = comparacionBrisca(cartasJugador[cartaElegidaJugador], cartasPrograma[cartaElegidaPrograma], muestra, primeroElegir);

            //Coje carta primero el ganador de la ronda
            if (turno) {
                cartasJugador[cartaElegidaJugador] = cartaSigiente();
                cartasPrograma[cartaElegidaPrograma] = cartaSigiente();
            } else {
                cartasPrograma[cartaElegidaPrograma] = cartaSigiente();
                cartasJugador[cartaElegidaJugador] = cartaSigiente();
            }

            ronda++;
        } while (baraja.numCartas() >= 2);
    }

    //Comparaciones para aberiguar que jugador gana la ronda
    public static boolean comparacionBrisca(Carta jugador,Carta programa,Carta muestra,boolean primeroElegir) {
        boolean ganadorRonda = true,turno = true;

        //Comprara que alguno de los dos tenga muestra
        if ((jugador.compararPalo(muestra)) || (programa.compararPalo(muestra))) {
            //Si los dos pertenecen a la muestra gana la de mayor valor
            if ((jugador.compararPalo(muestra)) && (programa.compararPalo(muestra))) {
                ganadorRonda = jugador.mayorValor(programa);
            } //Si el jugador no tiene muestra y el programa si gana la ronda
            else if ((jugador.compararPalo(muestra) == false) && (programa.compararPalo(muestra))) {
                ganadorRonda = false;
            } //Si el jugador tiene muestra y el programa no gana la ronda
            else if ((jugador.compararPalo(muestra)) && (programa.compararPalo(muestra) == false)) {
                ganadorRonda = true;
            }
        } //Compara que las dos cartas sean del mismo palo(Gana el de mayor valor)
        else if (jugador.compararPalo(programa)) {
            ganadorRonda = jugador.mayorValor(programa);
        } //Si no son del mismo palo gana el que primero aya elegido
        else if (primeroElegir) {ganadorRonda = true;} else {ganadorRonda = false;}

        //Muestra al usuario quien es el ganador de la ronda
        if (ganadorRonda) {System.out.println("\nHas ganado la ronda");}
        else {System.out.println("\nEl programa a ganado la ronda");}

        turno = ganadorRonda;

        return turno;
    }
}
