import java.util.Scanner;

public class EstadisticaPrueba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Estadistica es = new Estadistica();
       
        for( int i = 0 ; i < 10 ; i++){
            System.out.println("Escribe un numero");
            int a = scanner.nextInt();
            es.setNumero(a);
        }

        System.out.println("Este numero es el mayor : " + es.getMayor());
        System.out.println("Este numero es el menor : " + es.getMenor());
        System.out.println("La media es de : " + es.getMedia());
        scanner.close();
    }
}
