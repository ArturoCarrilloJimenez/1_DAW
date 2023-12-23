public class SuperpoderVuelo extends Superpoder {

    public SuperpoderVuelo() {
        super();
    }
    
    public SuperpoderVuelo(String nombre, String descripcion, int energia) {
        super(nombre, descripcion, energia);
    }

    //La energia al volar se gasta 1 de energia por cada 30 de tiempo
    //Este simpre redondeara a la alza
    public boolean usarPoder(int tiempo) {
        int energia;

        energia = (int)Math.ceil(tiempo / 30.0);

        return super.usarPoder(energia);
    }
}
