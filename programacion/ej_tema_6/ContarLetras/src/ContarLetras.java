import java.io.*;
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que nombre tendra el archivo");
        String nombreArchivo = scanner.nextLine();

        System.out.println("Escribe un texto para guardar en el archivo");
        String texto = scanner.nextLine();

        //Crea el archivo
        File file = new File(nombreArchivo + ".txt");

        //Flujo de salido (Guardo la informacion de los dos archivos en un nuevo archivo)
        try {
            // Creamos un objeto FileOutputStream para escribir en el archivo
            FileOutputStream fos = new FileOutputStream(file);

            //Guardo en este nuevo archivo el texto anterior
            fos.write(texto.getBytes());

            fos.close();
            
            System.out.println("Se ha guardado en el archivo en " + nombreArchivo + ".txt");

        } catch (IOException e) {
            // Si se produce algún error durante el procesamiento del archivo, lo tratamos aquí
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Ruta del fichero de texto
        String filePath = (nombreArchivo + ".txt");
        
        // Flujo de entrada de archivo
        FileInputStream fis = null;

        int numCaracter = 0;
        char[] caracter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};
        int[] nVeces =    { 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 };

        //Flujo de entrada (leo lo que hay en el archivo)
        try {
            // Abrir flujo de entrada para el archivo especificado
            fis = new FileInputStream(filePath);

            numCaracter = fis.available();

            // Leer contenido del archivo
            int content;
            while ((content = fis.read()) != -1) {
                // Convierte el byte leído en un carácter para mostrarlo
                char caracterTexto = Character.toLowerCase((char)(content));
                for (int i = 0;i < caracter.length;i++) {
                    if (caracter[i] == caracterTexto) {
                        nVeces[i]++;
                    }
                }
            }

        } catch (IOException e) {
            // Manejo de excepciones de entrada/salida
            e.printStackTrace();
        } finally {
            try {
                // Cerrar flujo de entrada de archivo
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                // Manejo de excepciones de cierre de archivo
                ex.printStackTrace();
            }
        }

        int letrasContadas = 0;
    
        System.out.println("Numero de caracteres del archivo: " + numCaracter);
        System.out.println("Letra |  Veces que aparece  |   Frecuencia");
        System.out.println("-----------------------------------------------");
        for (int i = 0;i < caracter.length;i++) {
            System.out.println("  " + caracter[i] + "       |      " + nVeces[i] + "         |       " + (nVeces[i] * 100 / numCaracter) + "%");
            letrasContadas += nVeces[i];
        }
        System.out.println("  El resto|      " + (numCaracter - letrasContadas) + "         |       " + ((numCaracter - letrasContadas) * 100 / numCaracter) + "%");

        scanner.close();
    }
}
