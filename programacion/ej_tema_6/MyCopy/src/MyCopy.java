import java.util.Scanner;
import java.io.*;

/* Copia un archivo en otro. Da igual el tipo de archivo */

/* Falta por hacer:
     -Indicador de progreso de la copia.
     -Que el programa pregunte el nombre del archivo de origen y el de destino
     -Que el programa avise si el archivo de destino ya existe antes de sobreescribirlo
*/

public class MyCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File fileOrigen;
        File fileDestino;

        String opcion;

        System.out.println("Introduce el nombre del fichero a copiar");
        String nombreFichero = sc.nextLine();

        do {
            System.out.println("Introduce el nombre del fichero destino");
            String nombreFicheroDestino = sc.nextLine();

            fileOrigen = new File(nombreFichero);
            fileDestino = new File(nombreFicheroDestino);

            opcion = "S";
            
            if (fileDestino.exists()) {
                System.out.println("Deseas sobreescribir el fichero(S/N)");
                opcion = sc.nextLine();
            }
        } while (opcion.equals("N"));
        
        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream(fileOrigen);
            fos = new FileOutputStream(fileDestino);
            int content;

            //Calcula cuanto es el 1%
            long porcentaje = fileOrigen.length() / 100;
            long contador = 0;
            int porciento = 0;

            while ((content = fis.read()) != -1) {
                fos.write(content);
                contador++;

                //Cada vez que copie un 1% lo muestra por pantalla
                if (contador == porcentaje) {
                    porciento++;
                    System.out.print("\r{"); //Vuelve al inicio y abre el corchete 

                    //Imprime una barra de progreso
                    for (int i = 0;i <100;i++) {
                        if (i < porciento) {
                            System.out.print("█");
                        }
                        else {
                            System.out.print(".");
                        }
                    }

                    System.out.print("} " + porciento + "%"); //Cierra corchete
                    contador = 0;
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Error al procesar el fichero");
            //e.printStackTrace();
        } 

        System.out.println("\nFichero copiado correctamente");
        sc.close();
    }
}

