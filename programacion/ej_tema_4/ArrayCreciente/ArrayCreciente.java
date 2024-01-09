import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCreciente {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList getArrayList() {
        return arrayList;
    }

    public ArrayCreciente() {
        //Inicializa el array
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

    public void introducirNumero(int num) {
        boolean nIntroducido = true;
        int i = 0;
        do {
            if (arrayList.get(0) > num) {
                arrayList.add(0,num);
                nIntroducido = false;
            } 
            else if (((arrayList.get(i) < num) && (arrayList.get(i + 1) > num))) {
                arrayList.add(i + 1,num);
                nIntroducido = false;
            }
            i++;
        } while (nIntroducido);
    }

    public static void main(String[] args) {
        ArrayCreciente arrayCreciente = new ArrayCreciente();
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        do {
            ArrayList<Integer> arrayList = arrayCreciente.getArrayList();

            for (int i = 0;i < 10;i++) {
                System.out.print(arrayList.get(i) + "   ");
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