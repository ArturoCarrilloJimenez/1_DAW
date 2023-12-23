public class SuperpoderMagia extends Superpoder {
    
    public SuperpoderMagia() {
        super();
    }

    public SuperpoderMagia(String nombre, String descripcion, int energia) {
        super(nombre, descripcion, energia);
    }

    //La energia se gasta segun el echizo a elegir
    public boolean usarPoder(int hechizo) {
        int energia;

        switch (hechizo) {
            case 1:
                energia = 10;
                break;
            case 2:
                energia = 20;
                break;
            case 3:
                energia = 30;
                break;
            case 4:
                energia = 40;
                break;
            case 5:
                energia = 50;
                break;
            case 6:
                energia = 60;
                break;
            case 7:
                energia = 70;
                break;
            case 8:
                energia = 80;
                break;
            default:
                return false;
        }
        return super.usarPoder(energia);
    }
}
