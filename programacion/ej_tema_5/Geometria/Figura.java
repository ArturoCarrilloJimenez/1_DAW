public class Figura {
    
    protected String color;
    protected boolean relleno;

    public Figura() {
        this.color = "Rojo";
        this.relleno = true;
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return this.relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String toString() {
        return ("\nSoy una figura de color " + this.getColor() + " y relleno " + this.isRelleno());
    }
}
