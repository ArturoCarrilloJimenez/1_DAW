public class ContadorAnimales {

    private static int contador = 0;

    // agrega animales al contador
    public static void incrementarContador() {
        contador++;
    }

    // retorna el contador
    public int getContador() {
        return this.contador;
    }
}
