// programa generico de un animal
public class Animal {
    protected String nombre;
    protected int edad;
    
    // costructor
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        ContadorAnimales.incrementarContador();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    
    // clona el nombre y edad para pasarla a otro objeto
    public Animal clone() {
        Animal nuevo = new Animal(this.nombre, this.edad);
        return nuevo;     
    }
    
    // comprueba dos objetos son iguales o no
    public boolean equals(Animal a) {
        if ((a.getNombre() == this.nombre) &&
            (a.getEdad() == this.edad)) {
            return true;
        } else {
            return false;
        }
    } 
}
