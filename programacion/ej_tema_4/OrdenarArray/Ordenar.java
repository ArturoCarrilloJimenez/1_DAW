public class Ordenar {
    
    public final int LONG = 2000;
    private int[] array= new int[LONG];
    private int j = 0;

    private void elegirNumero(){
        for (int i = 0;i < LONG;i++) {
            array[i] = (int)(Math.random()*200000);
        }
    }
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
}
