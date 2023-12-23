public class SuperpoderTelequinesis extends Superpoder {
    
    public SuperpoderTelequinesis() {
        super();
    }

    public SuperpoderTelequinesis(String nombre, String descripcion, int energia) {
        super(nombre, descripcion, energia);
    }

    //Se gasta 1 de energia por cada 10Kg movidos
    //Este simpre redondeara a la alza
    public boolean usarPoder(int masa) {
        int energia;

        energia = (int)Math.ceil(masa / 10.0);

        return super.usarPoder(energia);
    }
}
