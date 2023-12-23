public class LoteriaPrueba {
    public static void main(String[] args) {

        Loteria lt = new Loteria();

        int[] res = lt.resultado();

        for (int i = 0;i < 6;i++) {
            System.out.print(res[i] + " ");
        }
    }
}
