public class Superpoder {
    
    private String nombre,descripcion;
    private int energia;

    //Constructor de la clase superpoder
    public Superpoder() {
        this.nombre = "Desconocido";
        this.descripcion = "Desconocido";
        this.energia = 100;
    }

    public Superpoder(String nombre, String descripcion, int energia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.energia = energia;
    }

    //Metodos get y set para los atributos de la clase superpoder
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    //Metodo que comprueba si puede usuar el poder
    //Si se puede usar se resta la enrgia al nivel de energia
    public boolean usarPoder(int n) {
        boolean nivelEnergia;

        if (this.getEnergia() >= n) {
            nivelEnergia = true;
            this.setEnergia(this.getEnergia() - n);
        }
        else {nivelEnergia = false;}

        return nivelEnergia;
    }

    //Metodo descansar que restaura la energia un maximo de 100
    public void descansar(int n){
        if ((this.getEnergia() + n) >= 100) {
            this.setEnergia(100);
        }
        else {this.setEnergia(this.getEnergia() + n);}
    }
}
