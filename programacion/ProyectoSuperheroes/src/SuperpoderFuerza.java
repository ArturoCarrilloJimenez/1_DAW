public class SuperpoderFuerza extends Superpoder {
    
    public SuperpoderFuerza() {
        super();
    }

    public SuperpoderFuerza(String nombre, String descripcion, int energia) {
        super(nombre, descripcion, energia);
    }

    //La energia al volar se gasta 1 de energia por cada 1 de fuerza
    public boolean usarPoder(int fuerza) {
        return super.usarPoder(fuerza);
    }
}
