public class Baraja {

    private Carta[] baraja;

    public Baraja(int tipo) {
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
}
