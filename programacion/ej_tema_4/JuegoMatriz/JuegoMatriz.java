public class JuegoMatriz {
    
    public final int FIL = 4;
    public final int COLUM = FIL;
    public final int LONG_ARRAY = (FIL * COLUM) - 4;

    private int[][] matriz = new int[FIL][COLUM];

    // en el costructor inicializa la 
    public JuegoMatriz(){
        this.iniciarMatriz();
    }

    // genera un numero aleatorio del 0 al 9
    private int generarNum() {
        int num = (int)(Math.random()*10);
        return num;
    }
    // inicializo la matriz
    private void iniciarMatriz() {
        for (int i = 0;i < FIL;i++) {
            for (int j = 0;j < COLUM;j++) {
                matriz[i][j] = generarNum();
            }
        }
    }
    // mustra la matriz
    public int[][] mustraMatriz() {
        return matriz;
    }
    // guarda en un array los numero que esten el el borde
    public int[] perimetro() {
        int[] perimetro = new int[LONG_ARRAY];
        int i = 0,j = 0,posicionArray = 0;

        // lado arriba
        while (j < (COLUM - 1)) {
            perimetro[posicionArray] = matriz[i][j];
            j++;
            posicionArray++;
        }
        // lado derecho
        while (i < (FIL - 1)) {
            perimetro[posicionArray] = matriz[i][j];
            i++;
            posicionArray++;
        } 
        // lado abajo
        while (j >= 0) {
            perimetro[posicionArray] = matriz[i][j];
            j--;
            posicionArray++;
        }
        // reseteo las variables para que funcione correctamente
        j = 0;
        i = FIL - 2;
        // lado izquierdo
        while (i > 0) {
            perimetro[posicionArray] = matriz[i][j];
            i--;
            posicionArray++;
        }
        
        return perimetro;
    }
}
