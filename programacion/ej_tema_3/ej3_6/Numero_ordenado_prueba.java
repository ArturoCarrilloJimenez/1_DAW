import java.util.Scanner;

public class Numero_ordenado_prueba{

    public static void main(String[] args){
        Numero_ordenado pd = new Numero_ordenado();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero");
        pd.x = scanner.nextInt();

        System.out.println("Escribe un numero");
        pd.y = scanner.nextInt();

        System.out.println("Escribe un numero");
        pd.z = scanner.nextInt();

        if(pd.sonCorrelativo())System.out.println("Esta ordenado de menor a mayor y son correlativos");
        else if(pd.estaOrdenado())System.out.println("Estan ordenados de menor a mayor");
        else System.out.println("No estan ordenados de menor a mayor");

        scanner.close();
    }
}