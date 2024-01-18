import java.io.*;

public class Concadenar {
    public static void main(String[] args) {
        // Ruta del fichero de texto
        String filePath1 = "texto1.txt";
        String filePath2 = "texto2.txt";
        String texto = "";
        
        // Flujo de entrada de archivo
        FileInputStream fis = null;

        for (int i = 0;i <= 1;i++) {
            //Flujo de entrada (leo lo que hay en el archivo)
            try {
                // Abrir flujo de entrada para el archivo especificado
                if (i == 0) {fis = new FileInputStream(filePath1);}
                else {fis = new FileInputStream(filePath2);}
    
                // Leer contenido del archivo
                int content;
                while ((content = fis.read()) != -1) {
                    // Convierte el byte leído en un carácter para mostrarlo
                     char caracter = (char)(content);
                    texto += caracter; // Expresion que  suma lo que alla mas el caracter
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
        }
        
        // Creamos un objeto File que representa el archivo
        File archivo = new File("texto3.txt");

        //Flujo de salido (Guardo la informacion de los dos archivos en un nuevo archivo)
        try {
            // Creamos un objeto FileOutputStream para escribir en el archivo
            FileOutputStream fos = new FileOutputStream(archivo);

            //Guardo en este nuevo archivo el texto anterior
            fos.write(texto.getBytes());

            fos.close();
            
            System.out.println("Se ha guardado en el archivo en texto3.txt");

        } catch (IOException e) {
            // Si se produce algún error durante el procesamiento del archivo, lo tratamos aquí
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

