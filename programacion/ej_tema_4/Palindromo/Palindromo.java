import java.util.Scanner;

public class Palindromo {

    //Invierte la cadena
    private String invertir(String original) {
        StringBuilder cadena = new StringBuilder();

        for (int i = (original.length() - 1);i >= 0;i--) {
            cadena.append(original.charAt(i));
        }
        return cadena.toString();
    }

    //Elimina caracteres extraños como valores extraños, acentos y espacios
    private String eliminarCaracterRaro(String a) {
        String cadena = a;
    
        //Canvia toda la cadena a minuscula
        cadena = cadena.toLowerCase();
    
        //Canvia valores extraños a un espacio
        char[] valores = {',',';','.',':','-','_','?','¿','¡','!'};
        
        for (int i = 0; i < valores.length; i++) {
            cadena = cadena.replace(valores[i], ' ');
        }

        //Intenta eliminar los acentos, conclusion (Esto no funciona)
        String[] acentos = {"á", "é", "í", "ó", "ú", "ü"};
        String[] vocales = {"a", "e", "i", "o", "u", "u"};

        for (int i = 0; i < acentos.length; i++) {
            cadena = cadena.replace(acentos[i], vocales[i]);
        }

        //Elimina los espacios
        cadena = cadena.replaceAll(" ", "");
    
        System.out.println(cadena);
        return cadena;
    }
    
    //Balida que al derecho y invertido sean iguales
    public boolean esPalindromo(String original) {
        String cadenaNormal = original;
        String cadenaInvertida = invertir(original);

        cadenaNormal = eliminarCaracterRaro(cadenaNormal);
        cadenaInvertida = eliminarCaracterRaro(cadenaInvertida);

        return cadenaNormal.equals(cadenaInvertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Palindromo palindromo = new Palindromo();

        System.out.println("Escribe una frase para ver si es un palindromo (por favor no metas acentos, no va a valer)");
        String cadena = scanner.nextLine();
        
        if (palindromo.esPalindromo(cadena)) {System.out.println("Felicidades, esta frase si es un palidromo");} 
        else {System.out.println("Esta frase no es un palidromo");}
    }
}
