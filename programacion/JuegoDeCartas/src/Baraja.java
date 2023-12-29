public class Baraja {

    private Carta[] baraja;
    private int posicionCarta;

    public Baraja(int tipo) {

        posicionCarta = 0;

        switch (tipo) {
            case 1:
                barajaPoker();
                break;
            case 2:
                barajaEspanola();
                break;
            case 3:
                barajaAlemana();
                break;
            default:
                break;
        }
    }

    //Inicializa la baraja de poker
    private void barajaPoker() {
        baraja = new Carta[52];
        int nCarta = 0;

        for (int palo = 1; palo <= 4; palo++) {
            for (int valor = 1; valor <= 13; valor++) {
                baraja[nCarta] = new CartaPoker(valor, palo);
                nCarta++;
            }
        }
    }

    //Inicializa la baraja de espanola
    private void barajaEspanola() {
        baraja = new Carta[40];
        int nCarta = 0;
        
        for (int palo = 1; palo <= 4; palo++) {
            for (int valor = 1; valor <= 12; valor++) {
                baraja[nCarta] = new CartaEspanola(valor, palo);
                nCarta++;

                if (valor == 7) {valor = 9;}
            }
        }
    }

    //Inicializa la baraja de alemana
    private void barajaAlemana() {
        baraja = new Carta[36];
        int nCarta = 0;

        for (int palo = 1; palo <= 4; palo++) {
            for (int valor = 6; valor <= 14; valor++) {
                baraja[nCarta] = new CartaAlemana(valor, palo);
                nCarta++;
            }
        }
    }

    //Ordena de forma aleatoria el array
    public void barajar() {
        int posicion;

        for (int i = 0;i < baraja.length;i++) {
            //Si el numero salido es menor que la posicion la cual se va a guardar se eligira otro numero
            do {
                posicion = (int)(Math.random() * baraja.length);
            } while (posicion < i);

            //Guarda en una carta temporal el objeto elegido
            Carta cartaTemporal = baraja[i];

            //Intercanvian los objetos
            baraja[i] = baraja[posicion];
            baraja[posicion] = cartaTemporal;   
        }
    }

    //Devuelve la sigiente carta y esta no puede volver a aparecer
    public Carta siguiente() {
        Carta cartaActual = null;

        if (posicionCarta < baraja.length) {
            cartaActual = baraja[posicionCarta];
            baraja[posicionCarta] = null;
        }

        posicionCarta++;

        return cartaActual;
    }
}
