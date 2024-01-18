import java.io.*;

public class RecomponerTexto {

    public static void main(String[] args) {
        // Ruta del fichero de texto
        String filePath = "texto.txt";
        
        // Flujo de entrada de archivo
        FileInputStream fis = null;

        try {
            // Abrir flujo de entrada para el archivo especificado
            fis = new FileInputStream(filePath);

            // Imprimir tamaño del archivo
            System.out.println("Tamaño del archivo: " + fis.available());

            // Leer contenido del archivo
            int content;
            String texto = "";
            char caracter;
            
            while ((content = fis.read()) != -1) {
                // Convierte el byte leído en un carácter para mostrarlo
                caracter = (char)(content);
                texto += caracter; // Expresion que  suma lo que alla mas el caracter
            }
            
            texto = texto.replaceAll("\n", " ");

            System.out.println(texto);
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
    }
}