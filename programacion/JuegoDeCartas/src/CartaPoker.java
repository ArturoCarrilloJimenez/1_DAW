public class CartaPoker extends Carta{

    public CartaPoker(int valor, int palo) {
        super(valor,palo);
    }

    public String toString() {
        String palo = "",valor = "";

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getPalo()) {
            case 1:
                palo = "Picas";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Treboles";
                break;
            case 4:
                palo = "Diamantes";
                break;
        }

        //Switch que canbia el valor de el entero a su correspondido
        switch (super.getValor()) {
            case 1:
                valor = "A";
                break;
            case 11:
                valor = "J";
                break;
            case 12:
                valor = "Q";
                break;
            case 13:
                valor = "K";
                break;
            
                default:
                    valor = Integer.toString(super.getValor());
                    break;
        }

        return (valor + " de " + palo);
    }
}
