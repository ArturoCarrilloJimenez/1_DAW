import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {
    private ArrayList<Double> arrayList = new ArrayList<>();

    public Ordenar() {
        for (int i = 0; i < 1000; i++) {
            arrayList.add(Math.random() * 100000);
        }

        //Ordena el array de forma ascendenta
        Collections.sort(arrayList);

        for (int i = 0; i < 1000; i++) {
            System.out.println(arrayList.get(i));
        }
    }
    
    public static void main(String[] args) {
        Ordenar ordenar = new Ordenar();

    }
}