import java.util.Scanner;

public class Ordena_tamaño_prueba {
    public static void main (String[] args){

        int a, b, c;

        Ordena_tamaño pd = new Ordena_tamaño();
        Scanner scanner = new Scanner(System.in);

        // Pido los 3 numros
        System.out.println("Dime un numero");
        a = scanner.nextInt();
        System.out.println("Dime un segundo numero");
        b = scanner.nextInt();
        System.out.println("Dime un tercer numero");
        c = scanner.nextInt();

        // Con el set los paso al programa orddenar tamaño
        pd.setNumero1(a);
        pd.setNumero2(b);
        pd.setNumero3(c);

        // Seejecuta antes el menor porque si no en el programa el mediano no lo hace bien
        System.out.println("el numero " + pd.saberMayor() + " es el mayor, " + pd.saberMenor() + " es el menor y " + pd.saberMediano() + " es el mediano");

        scanner.close();
    } 
}
