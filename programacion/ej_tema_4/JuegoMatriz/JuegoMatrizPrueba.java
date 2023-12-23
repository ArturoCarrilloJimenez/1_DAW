import java.util.Scanner;

public class JuegoMatrizPrueba {
    public static void main(String[] args) {
        
        JuegoMatriz jm = new JuegoMatriz();
        Scanner sc = new Scanner(System.in);

        int[][] matriz = jm.mustraMatriz();
        int[] perimetro = jm.perimetro();

        int opcion = 4;

        do {
            System.out.println("1. Mostrar matriz");
            System.out.println("2. Muestra el perimetro");
            System.out.println("3. Muestra matriz en espiral");
            System.out.println("4. Fin programa");

            System.out.println();

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            
            System.out.println();

            if (opcion == 1) {
                System.out.println("Aqui tienes la matriz");
                for (int i = 0;i < jm.FIL;i++) {
                    for (int j = 0;j < jm.COLUM;j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            if (opcion == 2) {
                System.out.println("Aqui tienes el perimetro");
                for (int i = 0;i < jm.LONG_ARRAY;i++) {
                    System.out.print(perimetro[i] + " ");
                }
                System.out.println();
                System.out.println();
            }
            if (opcion == 3) {
                    
            }
        } while (opcion != 4);
        
        sc.close();
    }
}
