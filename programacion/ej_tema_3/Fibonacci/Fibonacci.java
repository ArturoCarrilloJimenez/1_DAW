public class Fibonacci {

    private int nveces;
    private int[] fibonacci; // defino el array

    public void setNumero(int a){
        nveces = a;
        this.inicio();
    }

    // asigno a las casillas iniciles del array 0 y 1
    private void inicio(){
        fibonacci = new int[nveces]; // Inicializa el array con el tamaño adecuado
        fibonacci[0] = 0;
        fibonacci[1] = 1; 
    }
    // subalgoridmo que calcula fibonacci
    public int[] getFibonacci(){

        int i = 2; // este es el incrementador que incida la cantidad de nuneros que a  mostrado
        int c = 1; // esta es la posicion actual del array
        int n1 = 0; // este es el numero anterior
        int n2 = 1; // este es el numero actual

        while (i < nveces) {
            c++;

            fibonacci[c] = (n1 + n2);

            n1 = n2; // guardo en n1 el numero anterior
            n2 = fibonacci[c]; // guardo en n2 el numero actual

            i++;
        }

    return fibonacci;
    }
}    