import java.util.Scanner;

public class MeteorologiaPrueba {
    public static void main(String[] args){

        String atm,hmd;

        Scanner scanner = new Scanner(System.in);
        Meteorologia mt = new Meteorologia();

        do {
            System.out.println("Como esta la precision atmosferica (alta, media o baja)");
            atm = scanner.nextLine();
        } while ((atm == "alta") | (atm == "media") | (atm == "baja"));

        do {
            System.out.println("Como esta la humedad relativa (alta, media o baja)");
            hmd = scanner.nextLine();
        } while ((hmd == "alta") | (hmd == "media") | (hmd == "baja"));

        mt.setDatos(atm, hmd);
        
        System.out.println("Probabilidad de lluvia: " + mt.lluvia());
        scanner.close();
    }
}
