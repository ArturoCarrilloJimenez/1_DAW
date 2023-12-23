public class BuscarArray {

    public final int LONG = 200;
    private int[] array= new int[LONG];
    private int j = 0;

    // elige numeros aleatorios para cada posicion del array
    private void elegirNumero(){
        for (int i = 0;i < LONG;i++) {
            array[i] = (int)(Math.random()*200);
        }
    }
    // ordena el array de menor a mayor
    public int[] ordenarArray(){
        this.elegirNumero();

        for (int i = 0;i < (LONG - 1);i++) {
            j++;
            if (array[i] > array[j]) {
                int n = array[i];
                array[i] = array[j];
                array[j] = n;
        
                i = -1;
                j = 0;
            }
        }

        return array;
    }
    // busca si un numero introducido esta o no
    public int buscar(int a) {

        int num = a;
        boolean encontrado = false;
        int inicio = 0;
        int fin = LONG - 1;
        int mitad = (int)(LONG / 2);

        //mira si el num esta en la posicion 0
        if ((array[0] == num)) {
            mitad = 0;
            return mitad;
        }
        //mira si el num en la ultima posicion
        else if (array[LONG - 1] == num) {
            mitad = LONG - 1;
            return mitad;
        }

        while (!encontrado  && mitad < fin-1) {
            // si el numero es menor divide la mitad anterior entre 2
            // el fin es el medio
            if (array[mitad] > num) {
                fin = mitad;
                mitad = (mitad / 2);
            }
            // si el numero es mayor resta el inicio al fin y lo divide
            // el inicio es la mitad
            else if (array[mitad] < num) {
                inicio = mitad;
                mitad = inicio + ((fin - inicio) / 2);
            }
            // si lo encuentra pone a verdadero el validador
            // retorna la posicion el la que se encuentra
            else if (array[mitad] == num) {
                encontrado = true;
                return mitad;
            }
        }

        mitad = -1;

        return mitad;
    }
}
