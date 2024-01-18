import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class GeneradorWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(
            "<html lang=\"en\">\n" + 
            "<head>\n" + 
            "   <meta charset=\"UTF-8\">\n" +
            "   <title>index</title>\n" +
            "</head>\n" +
            "<body>\n");

        System.out.println("Que texto aparecera en el encabezado");
        String encabezado = sc.nextLine();

        stringBuilder.append("  <h1>" + encabezado + "</h1>\n");

        stringBuilder.append(
                "   <style>\n" +
                "       h1 {\n");
        
        stringBuilder.append(atributos());

        System.out.println("Que texto aparecera en el cuerpo");
        String cuerpo = sc.nextLine();

        stringBuilder.append("  <p>" + cuerpo + "</p>\n");

        stringBuilder.append(
                "   <style>\n" +
                "       p {\n");
        
        stringBuilder.append(atributos());
        
        File fileDestino;

        fileDestino = new File("index.html");

        FileOutputStream fos;
        try {
            fos = new FileOutputStream(fileDestino);
            
            //Guarda el stringBuilder en el fichero
            fos.write(stringBuilder.toString().getBytes());
        } 
        catch (Exception e) {
            System.out.println("Error al procesar el fichero");
            e.printStackTrace();
        } 

        System.out.println("\nFichero copiado correctamente");
        sc.close();
    }

    public static String atributos() {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int opcion;

        do {
            System.out.println("Que atributos quieres que tenga el encabezado");
            System.out.println("1 - Tamaño");
            System.out.println("2 - Color");
            System.out.println("3 - Tipo de letra");
            System.out.println("4 - Alineacion");
            System.out.println("0 - Salir");

            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Que tamaño quieres que tenga el encabezado");
                    int tamano = sc.nextInt();
                    stringBuilder.append("           font-size: " + tamano + "px;\n");
                    break;
                case 2:
                    System.out.println("Que color en hexadecimal quieres que tenga");
                    sc.nextLine();
                    String color = sc.nextLine();
                    stringBuilder.append("           color: " + color + ";\n");
                    break;
                case 3:
                    System.out.println("Que tipo de letra quieres que tenga");
                    sc.nextLine();
                    String tipoLetra = sc.nextLine();
                    stringBuilder.append("           font-family: " + tipoLetra + ";\n");
                    break;
                case 4:
                    System.out.println("Que aliniacion quieres que tenga");
                    sc.nextLine();
                    String aliniacion = sc.nextLine();
                    stringBuilder.append("           text-align: " + aliniacion + ";\n");
                    break;
                default:
                    opcion = 0;
                    stringBuilder.append(
                        "       }\n" + 
                        "   </style>\n"
                    );
                    break;
            }
        } while (opcion != 0);

        sc.close();

        return stringBuilder.toString();
    }
}
