public class CartaAlemana extends Carta {

    public CartaAlemana(int valor, int palo) {
        super(valor,palo);
    }

    public String toString() {
        String palo = "",valor = "";

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getPalo()) {
            case 1:
                palo = "Bellotas";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Campanas";
                break;
            case 4:
                palo = "Pastos";
                break;
        }

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getValor()) {
            case 11:
                valor = "Campesino";
                break;
            case 12:
                valor = "Dama";
                break;
            case 13:
                valor = "Rey";
                break;
            case 14:
                valor = "As";
                break;
            
                default:
                    valor = Integer.toString(super.getValor());
                    break;
        }

        return "CartaAlemana: " + valor + " de " + palo;
    }
}
