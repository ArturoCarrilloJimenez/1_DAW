import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DescomponerTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = scanner.nextLine();

        // Creamos un objeto File que representa el archivo
        File archivo = new File("texto.txt");

        try {
            // Creamos un objeto FileOutputStream para escribir en el archivo
            FileOutputStream fos = new FileOutputStream(archivo);
            
            //Convierto los espacios en un salto de linea
            String[] palabras = texto.split(" ");

            // Escribimos el texto en el archivo
            for (int i = 0;i < palabras.length;i++) {
                fos.write(palabras[i].getBytes());
                if ((i + 1) < palabras.length) {
                    fos.write('\n');
                }
            }

            fos.close();
            
            System.out.println("La tabla de multiplicar se ha guardado en el archivotexto.txt");

        } catch (IOException e) {
            // Si se produce algún error durante el procesamiento del archivo, lo tratamos aquí
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
