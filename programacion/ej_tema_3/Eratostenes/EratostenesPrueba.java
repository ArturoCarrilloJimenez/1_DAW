import java.util.Scanner;

public class EratostenesPrueba {
    public static void main(String[] args){

        int i;

        Scanner scanner = new Scanner(System.in);
        Eratostenes pr = new Eratostenes();

        i = 1000;

        do{
            pr.setNumero(i);

            if (pr.getPrimo()) {System.out.println(i);}

            i--;
        }
        while(i >= 2);

        scanner.close();
    }
}
