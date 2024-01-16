import java.util.Scanner;

public class Palindromo {

    //Invierte la cadena
    private String invertir(String original) {
        StringBuilder cadenaInv = new StringBuilder(original);

        cadenaInv = cadenaInv.reverse();

        return cadenaInv.toString();
    }

    //Elimina caracteres extraños como valores extraños, acentos y espacios
    private String eliminarCaracterRaro(String a) {
        String cadena = a;
    
        //Canvia toda la cadena a minuscula
        cadena = cadena.toLowerCase();
    
        //Canvia valores extraños a un espacio
        char[] valores = {',',';','.',':','-','_','?','¿','¡','!','(',')'};
        
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
    
        return cadena;
    }
    
    //Balida que al derecho y invertido sean iguales
    public boolean esPalindromo(String original) {
        String cadenaNormal = original;
        String cadenaInvertida;

        cadenaNormal = eliminarCaracterRaro(cadenaNormal);
        
        cadenaInvertida = invertir(cadenaNormal);

        System.out.println(cadenaNormal);
        System.out.println(cadenaInvertida);

        return cadenaNormal.equals(cadenaInvertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Palindromo palindromo = new Palindromo();

        System.out.println("Escribe una frase para ver si es un palindromo (por favor no metas acentos, no va a valer)");
        String cadena = scanner.nextLine();
        
        if (palindromo.esPalindromo(cadena)) {System.out.println("Felicidades, esta frase si es un palidromo");} 
        else {System.out.println("Esta frase no es un palidromo");}

        scanner.close();
    }
}
