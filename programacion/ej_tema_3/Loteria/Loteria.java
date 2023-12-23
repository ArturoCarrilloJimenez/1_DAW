// esta clase genera 6 numeros aleatorios
public class Loteria {
    
    private int num;
    private int[] loto = new int [6];

    // genera num aleatorios
    private int numAleatorio(){
        num = (int)(Math.random()*48 + 1);
        return num;
    }

    // guarda los num aleatorios en el array
    private void verIuales(){
        int i = 0;

        while (i <= 5) {

            int i2= 0;

            loto[i] = numAleatorio();

                // este bucle comprueba si el numero es igual a alguno de los anteriores guardados
                while (i2 < i) {
                    if (loto[i] == loto[i2]) {
                        loto[i] = numAleatorio();
                    }
                    i2++;
                }

            i++;
        }
    }
    // manda el array
    public int[] getLoto(){
        this.verIuales();
        return loto;
    }
}
