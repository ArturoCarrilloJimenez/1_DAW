public class Rectangulo extends Figura{
    
    protected double ancho,alto;

    public Rectangulo() {
        super();
        this.ancho = 0;
        this.alto = 0;
    }

    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(String color, boolean relleno, double ancho, double alto) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getArea() {
        double area;

        area = this.ancho * this.alto;

        return area;
    }

    public double getPerimetro() {
        double perimetro;

        perimetro = (2 * this.ancho) + (2 * this.alto);

        return perimetro;
    }

    public String toString() {
        String s = super.toString();
        return (s + "\nSoy un rectangulo de ancho " + this.getAncho() + ",alto " + this.getAlto() + ",area " + this.getArea() + " y perimetro " + this.getPerimetro());
    }
}
