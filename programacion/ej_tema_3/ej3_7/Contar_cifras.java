//Algoridmo que cuenta cuantas cifras tiene un nuero de 5 cifras como maximo
public class Contar_cifras{

    public int n,c;

    public int contarCifra(){

        if(n>= 10000 || n<= -10000)c = 5;
        else if(n >= 1000 || n <= -1000)c = 4;
        else if(n >= 100 || n <= -100)c = 3;
        else if(n >= 10 || n <= -10)c = 2;
        else if(n >= 0 || n <= 0)c = 1;
        
        return c;
    }
}