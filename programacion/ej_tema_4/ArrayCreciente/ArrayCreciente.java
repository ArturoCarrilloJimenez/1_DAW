import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCreciente {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList getArrayList() {
        return arrayList;
    }

    public ArrayCreciente() {
        inicializarArray();
    }

    //Inicializa el array
    public void inicializarArray() {
        for (int i = 0;i < 10;i++) {
            arrayList.add((int)((Math.random()*100) + 1));

            //Realiza comprobaciones recorriendo el array
            for (int j = 0;j < i;j++) {
                //En caso de ser igial el numero elige otro
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayList.add((int)((Math.random()*100) + 1));
                    j = 0;
                } //En caso de que el siginte numero sea menor se intercanvian
                else if (arrayList.get(j) > arrayList.get(j + 1)) {

                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j+1));
                    arrayList.set(j + 1,temp);

                    j = 0;
                }
            }
        }
    }
    // Introduce un numero a la posicion en lo que siga el array ordenado
    public void introducirNumero(int num) {
        boolean nIntroducido = true;
        int i = 0;
        do {
            //Si es mas pequeño que la primera posicion lo pone en primer lugar
            if (arrayList.get(0) > num) {
                arrayList.add(0,num);
                nIntroducido = false;
            } //Si esta entre dos numeros lo mete entre los dos
            else if (((arrayList.get(i) < num) && (arrayList.get(i + 1) > num))) {
                arrayList.add(i + 1,num);
                nIntroducido = false;
            } //Si ya existe lo mete detras
            else if (arrayList.get(i) == num) {
                arrayList.add(i + 1,num);
                nIntroducido = false;
            }

            //Elimina la ultima celda
            arrayList.remove(10);

            i++;
        } while (nIntroducido);
    }

    public static void main(String[] args) {
        ArrayCreciente arrayCreciente = new ArrayCreciente();
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do {
            ArrayList<Integer> arrayList = arrayCreciente.getArrayList();

            //Bucle for-each
            for (int elemento : arrayList) {
                System.out.print(elemento + "   ");
            }

            do {
                System.out.println("\nIntroduce un numero del 1 al " + arrayList.get(9));
                num = scanner.nextInt();
            } while ((num > arrayList.get(9)));

            if ((num >= 1)) {
                arrayCreciente.introducirNumero(num);
            }

        } while (num >= 1);

        scanner.close();
    }
}