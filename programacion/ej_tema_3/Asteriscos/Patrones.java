// Este programa crea triangulos con asteriscos

public class Patrones {

    private int asteriscosTriangulo = 1,espacioTriangulo,espacioRombo;

    public void setAlturaTrian(int a){espacioTriangulo = a - 1;}

    // Algoridmo que dibuja un triangulo con asteriscos
    public String triangulo() {

        // Este es un string el cual puedes modificar para asi poder crear el patron y devolverlo
        StringBuilder listTriangulo = new StringBuilder();

        while (espacioTriangulo >= 0) {
            int i = 0;
            while (i <= espacioTriangulo) {
                listTriangulo.append(" ");// listTriangulo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
            i = 1;
            while (i <= asteriscosTriangulo) {
                listTriangulo.append("*");// listTriangulo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
           listTriangulo.append("\n");// listTriangulo es la variable y el .append es una clase que añade uno o varios caracteres (el \n es un salto de linea)

            asteriscosTriangulo = asteriscosTriangulo + 2;
            espacioTriangulo = espacioTriangulo - 1;
        }
        return listTriangulo.toString();// El .toString se utiliza para convertir en String, sin este no podriamos mostar este como string
    }

    public void setAltRombo(int b){espacioRombo = b / 2;}
    private int asteriscosRombo = 1;

    // Este programa crea un rombo
    public String rombo() {

        // Este es un string el cual puedes modificar para asi poder crear el patron y devolverlo
        StringBuilder listaRombo = new StringBuilder();
        
        while (espacioRombo >= 0) {
            int i = 0;
            while (i <= espacioRombo) {
                listaRombo.append(" ");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
            i = 1;
            while (i <= asteriscosRombo) {
                listaRombo.append("*");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
           listaRombo.append("\n");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres (el \n es un salto de linea)

            asteriscosRombo = asteriscosRombo + 2;
            espacioRombo = espacioRombo - 1;
        }
        while (asteriscosRombo >= 0) {
            int i = 0;
            while (i <= espacioRombo) {
                listaRombo.append(" ");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
            i = 1;
            while (i <= asteriscosRombo) {
                listaRombo.append("*");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres
                i = i + 1;
            }
            listaRombo.append("\n");// listRombo es la variable y el .append es una clase que añade uno o varios caracteres (el \n es un salto de linea)
            
            asteriscosRombo = asteriscosRombo - 2;
            espacioRombo = espacioRombo + 1;
        }
        return listaRombo.toString();// El .toString se utiliza para convertir en String, sin este no podriamos mostar este como string
    }
}
