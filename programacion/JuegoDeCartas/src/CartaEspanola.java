public class CartaEspanola extends Carta {

    public CartaEspanola(int valor, int palo) {
        super(valor,palo);
    }

    public String toString() {
        String valor = "",palo = "";

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getPalo()) {
            case 1:
                palo = "Oros";
                break;
            case 2:
                palo = "Bastos";
                break;
            case 3:
                palo = "Espadas";
                break;
            case 4:
                palo = "Copas";
                break;
        }

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getValor()) {
            case 10:
                valor = "Sota";
                break;
            case 11:
                valor = "Caballo";
                break;
            case 12:
                valor = "Rey";
                break;
            
                default:
                    valor = Integer.toString(super.getValor());
                    break;
        }

        return ("CartaEspanola: " + valor + " de " + palo);
    }
}
