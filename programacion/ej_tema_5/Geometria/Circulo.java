public class Circulo extends Figura {
    
    private double radio;

    public Circulo() {
        super();
        this.radio = 1.0;
    }
    
    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        double area;

        area = Math.PI * Math.pow(this.radio,2);

        return area;
    }

    public double getPerimetro() {
        double perimetro;

        perimetro = (2 * Math.PI) * this.radio;

        return perimetro;
    }

    public String toString() {
        String s = super.toString();
        return (s + "\nSoy un circulo de radio " + this.getRadio() + ",area " + this.getArea() + " y perimetro " + this.getPerimetro());
    }
}
