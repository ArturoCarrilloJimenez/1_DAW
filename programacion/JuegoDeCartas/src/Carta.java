public class Carta {

    private int valor,palo;

    //Costructor
    public Carta(int valor, int palo) {
        this.valor = valor;
        this.palo = palo;
    }

    //Getter and Setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    //Compara si es el mismo abjeto
    public boolean equals(Carta obj) {
        boolean equals = false;

        if ((obj.getValor() == this.getValor()) && (obj.getPalo() == this.getPalo())) {
            equals = true;
        }
        else {equals = false;}

        return equals;
    }

    //Clona los valores
    public void clone(Carta obj) {
        obj.setValor(this.valor);
        obj.setPalo(this.palo);
    }

    //Compara si los numeros son iguales
    public boolean compararNumero(Carta obj) {
        boolean equals = false;

        if (obj.getValor() == this.getValor()) {
            equals = true;
        }
        else {equals = false;}

        return equals;
    }

    //Compara si los palos son iguales
    public boolean compararPalo(Carta obj) {
        boolean equals = false;

        if (obj.getPalo() == this.getPalo()) {
            equals = true;
        }
        else {equals = false;}

        return equals;
    }

    //Si el valor es igual se comparan el palo
    public boolean mayorQue(Carta obj) {
        boolean mayor = false;

        if (compararNumero(obj)) {
            if (this.getPalo() > obj.getPalo()) {
                mayor = true;
            }
            else {mayor = false;}
        }
        else {
            if (this.getValor() > obj.getValor()) {
                mayor = true;
            }
            else {mayor = false;}
        }

        return mayor;
    }
}