public class Ej2 {
    public static void main(String[] args) {
        int ip = 0,ii = 0;
        int pares[] = new int[100];
        int impares[] = new int[100];

        for (int i = 1;i < 201;i++) {
            if ((i % 2) == 0) {
                pares[ip] = i;
                ip++;
            }
            else {
                impares[ii] = i;
                ii++;
            }
        }
        
        System.out.println("Numeros Pares");
        for (int i = 0;i < 100;i++) {
            System.out.print(pares[i] + " - ");
        }

        System.out.println("\nNumeros Pares");
        for (int i = 0;i < 100;i++) {
            System.out.print(impares[i] + " - ");
        }
    }
}
