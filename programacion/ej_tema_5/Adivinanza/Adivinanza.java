public class Adivinanza {

    private int numeroAleatorio;
    private boolean adivinar;
    public Adivinanza() {
        numeroAleatorio = (int)(Math.random()*10);
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }
    
    public boolean equals(int numUsuario) {
        if (numeroAleatorio == numUsuario) {
            adivinar = true;
        }
        else {adivinar = false;}
        return adivinar;
    }
}
