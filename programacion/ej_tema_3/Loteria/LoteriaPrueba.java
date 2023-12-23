public class LoteriaPrueba {
    public static void main(String[] args){

        Loteria lt = new Loteria();

        int[] array = lt.getLoto();
        
        int i = 0;

        while (i <= 5) {
           System.out.print(array[i] + " ");
           i++; 
        }
    }
}
