// programa gato heredado de animal
public class Gato extends Animal {
    
    private int vidas;

    public Gato(String nombre, int edad) {
        super(nombre, edad);
        this.vidas = 7;
    }
    
    public int getVidas() {
        return this.vidas;
    }

    // resta una vida
    public void restarVida() {
        this.vidas--;
    }
}
