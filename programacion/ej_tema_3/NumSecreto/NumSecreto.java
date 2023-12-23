public class NumSecreto {

    // genero un num aleatorio
    private int num,i = 0,secr =  (int)(Math.random()*100 + 1);
    private boolean correcto = false;

    public void setNumero(int a){
        num = a;
        i++;
        this.validarNum();
    }

    // este metodo guarda en un StringBuilder si el num secreto es mayor o menor
    public String mayorMenor(){
        StringBuilder mayorMenor = new StringBuilder();

        if (num < secr) {mayorMenor.append("Mayor");}
        else {mayorMenor.append("Menor");}

        return mayorMenor.toString();
    }
    // comprueba si has acertado el num secreto
    public boolean validarNum(){
        if (num == secr) {correcto = true;}

        return correcto;
    }
    // muestra el num de intentos
    public int intentos(){
        return i;
    }
}
