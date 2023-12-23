public class MatrizSimple {

    public final int FILA = 3;
    public final int COLUM = 3;

    private int[][] matriz = new int[FILA][COLUM];

    // inicializa a la matriz a -1
    private void inicializarMatriz(){
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; i < COLUM; I++) {
                matriz[i][j] = -1;
            }
        }
    }
}
