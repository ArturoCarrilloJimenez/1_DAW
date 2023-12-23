public class OrdenarPrueba {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Ordenar or = new Ordenar();
        int[] a = or.ordenarArray();

        for (int i = 0;i < or.LONG;i++) {
            System.out.print(a[i] + " - ");
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double seconds = duration / 1000000;
        System.out.println("\nEl tiempo de ejecución fue de " + seconds + " milisegundos.");
    }
}

