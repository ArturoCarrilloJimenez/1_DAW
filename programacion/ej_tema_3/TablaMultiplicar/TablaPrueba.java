import java.util.Scanner;

public class TablaPrueba {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Tabla tb = new Tabla();

        System.out.println("Escribe el numero del que quieres hacer la tabla de multiplicar");
        int n1 = scanner.nextInt();

        System.out.println("Hasta que numero quieres haga la tabla de multiplicar");
        int n2 = scanner.nextInt();

        tb.setNumero1(n1);
        tb.setNumero2(n2);

        System.out.println("Aqui tienes tu tabla de multiplicar");
        System.out.println(tb.tablaMultiplicar());
        scanner.close();
    }
}
