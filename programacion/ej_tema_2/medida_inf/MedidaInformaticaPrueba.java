import java.util.Scanner;

public class MedidaInformaticaPrueba {
    public static void main(String[] args){

        double c;
        int t;

        MedidaInformatica mInf = new MedidaInformatica();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe la unidad de medida que quieras pasar: 1(Byte), 2(Bits), 3(Gb), 4(Mb) o 5(Mib)");
        t = scanner.nextInt();
        System.out.println("Escribe la cantidad que quieras pasar");
        c = scanner.nextDouble();

        mInf.setTipo(t);
        mInf.setCantidad(c);

        System.out.println("Son " + mInf.pasarByte() + " Byte");
        System.out.println("Son " + mInf.byteBits() + " Bits");
        System.out.println("Son " + mInf.byteGb() + " Gb");
        System.out.println("Son " + mInf.byteMb() + " Mb");
        System.out.println("Son " + mInf.byteMib() + " Mib");

        scanner.close();
    }
}
