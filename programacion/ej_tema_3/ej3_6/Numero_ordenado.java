public class Numero_ordenado {

    public int x, y, z;
    public boolean ordenado, correlativo;
    
    
    public boolean estaOrdenado(){

        if((x < y) && (y < z))ordenado = true;
        else ordenado = false;

        return ordenado;
    }
    public boolean sonCorrelativo(){

        if((x == (y - 1)) && (y == (z - 1)))correlativo = true;
        else correlativo = false;

        return correlativo;
    }
}