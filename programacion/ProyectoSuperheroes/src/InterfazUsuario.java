import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfazUsuario {

    static final int MAX_SUPERHEROES = 6;
    static int numSuperheroe = 1;
    static Superheroe[] superheroe = new Superheroe[MAX_SUPERHEROES];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opciones;

        //Programa que se ejecuta hasta que el usuario elige 0
        do {
            System.out.println("\nELIGE UNA OPCIÓN:");
            System.out.println("1. Crear superhéroe");
            System.out.println("2. Agregar poder");
            System.out.println("3. Eliminar poder");
            System.out.println("4. Consultar lista de poderes");
            System.out.println("5. Consultar poder");
            System.out.println("6. Usar poder");
            System.out.println("7. Descansar");
            System.out.println("8. Lista superheroe");
            System.out.println("0. Salir del programa\n");

           opciones = elegirOpcion();

            if (opciones == 1) {crearSuperheroe();}

            //Solo sera posible ejecutar las sigientes opciones cuando se alla creado un superheroe
            //Ademas las opciones deven de ser distintas de 0(salir del programa) o  1(crear supeeheroe)
            if ((superheroe[1] != null) && (opciones != 0) && (opciones != 1)) {
                if ((opciones >= 2) && (opciones <= 7)) {
                    int nSuperheroe = elegirSuperheroe();

                    switch (opciones) {
                        case 2:
                            agregarPoder(nSuperheroe);
                            break;
                        case 3:
                            eliminarPoder(nSuperheroe);
                            break;
                        case 4:
                            verListaPoderes(nSuperheroe);
                            break;
                        case 5:
                            verPoder(nSuperheroe);
                            break;
                        case 6:
                            usarPoder(nSuperheroe);
                            break;
                        case 7:
                            descansar(nSuperheroe);
                            break;
                        default:
                            break;
                    }
                }
                if (opciones == 8) {listaSuperheroes();}
            }
            else if ((opciones != 0) && (opciones != 1) && superheroe[1] == null) { //Solo se ejecuta cuando no ay un superheroe creado y ademas la opcion es distinto de 1 o 0
                System.out.println("\nNo hay ningin superheroe creado");
            }
        } while (opciones != 0);

        System.out.println("\nGracias por haber probado mi programa");
    }

    //Valida que el dato introducido sea un numero
    public static int escribirNumero() {
        int n = -1;
        
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
            scanner.nextLine();
        }

        return n;
    }

    //El usuario elige la opcion
    public static int elegirOpcion() {
        int opciones = -1;

         do {
            System.out.println("Que opocion quieres ejecutar");
            
            opciones = escribirNumero();

            //Mensaje de error si no ay ninguna opcion con ese numero
            if ((opciones < 0) || (opciones > 8)) {
                System.out.println("Error, solo se pueden elegir las opciones mostradas anteriormente");
            }
        } while ((opciones < 0) || (opciones > 8));

        return opciones;
    }

    //Pide al usuario que eliga un superheroe
    public static int elegirSuperheroe() {
        int nSuperheroe = -1;
                
        do {
            System.out.println("\nElige un superheroe (1 al " + (numSuperheroe - 1) + ")");

            nSuperheroe = escribirNumero();
            
            //Mensaje de error en caso de no existir ese superheroe
            if ((nSuperheroe < 1) || (nSuperheroe >= numSuperheroe)) {
                System.out.println("Error, no existe este superheroe");
            }
        } while ((nSuperheroe < 1) || (nSuperheroe >= numSuperheroe));

        return nSuperheroe;
    }

    //Lista con los tipos de poderes
    public static void listaTiposPoderes() {
        System.out.println("1 - Vuelo");
        System.out.println("2 - Fuerza");
        System.out.println("3 - Magia");
        System.out.println("4 - Telequinesis\n");
    }

    //Opcion 1 Crar superpoder
    //Se asigna automaticamente el numero de el superheroe empezando en 0
    //En caso de llegar al limite de de superheroes este dara un mensaje de error
    public static void crearSuperheroe() {
        if (numSuperheroe < MAX_SUPERHEROES) {
            System.out.println("\nQue nombre le pondrar a tu superheroe");

            scanner.nextLine();
            String nombreHeroe = scanner.nextLine();

            superheroe[numSuperheroe] = new Superheroe(nombreHeroe);

            System.out.println("\nEl superheroe numero " + numSuperheroe + " se ha crado correctamente");
            numSuperheroe++;
        }
        else {System.out.println("Lo siento, no es posible crear mas superheroes");}
    }

    //Opcion 2 Agregar poder
    //El usuario introducira su nombre, descripcion y tipo
    //En caso de ya existir un superpoder del mismo tipos este dara un mensaje de error
    public static void agregarPoder(int nSuperheroe) {
        System.out.println("\nQue nombre le quieres poner a tu poder");

        scanner.nextLine();
        String nombrePoder = scanner.nextLine();

        System.out.println("Escribe una descripcion de este poder");

        String descrPoder = scanner.nextLine();

        System.out.println("\nElige un tipo de superpoder");
        listaTiposPoderes();
        System.out.println("Que tipo deseas que tenga");

        int tipoSuperpoder = -1;

        do {
            tipoSuperpoder = escribirNumero();
            //Mensaje de error si esta fuera de rango
            if ((tipoSuperpoder < 1) || (tipoSuperpoder > 4)) {
                System.out.println("Solo es posible elegir entre los tipos de poderes anteriores");
            }
        } while ((tipoSuperpoder < 1) || (tipoSuperpoder > 4));

        boolean agregarPoder = superheroe[nSuperheroe].agregarPoder(nombrePoder, descrPoder, tipoSuperpoder);

        if (!agregarPoder) {
            System.out.println("\nNo ha sido posible crear este poder");
        }
        else {System.out.println("");}
    }

    //Opcion 3 Eliminar poder
    //El usuario elige el tipo de poder que desea eliminar
    //En caso de no existir ese poder dara un mensaje de error 
    public static void eliminarPoder(int nSuperheroe) {
        verListaPoderes(nSuperheroe);

        System.out.println("\nQue tipo de poder quieres eliminar");

        int tipoSuperpoder = -1;

        do {
            tipoSuperpoder = escribirNumero();
            //Mensaje de error si esta fuera de rango
            if ((tipoSuperpoder < 1) || (tipoSuperpoder > 4)) {
                System.out.println("Solo es posible elegir entre los tipos de poderes 1 al 4");
            }
        } while ((tipoSuperpoder < 1) || (tipoSuperpoder > 4));

        boolean eliminarPoder = superheroe[nSuperheroe].eliminarPoder(tipoSuperpoder);

        if (!eliminarPoder) {
            System.out.println("\nNo ha sido posible eliminar este poder");
        }
    }

    //Opcion 4 Consultar lista de poderes
    //Muestra todos los poderes que tiene (este mostrara el nombre de la categoria)
    //Si no tiene algun poder se mostrara el numero de la categoria sin contenido
    public static void verListaPoderes(int nSuperheroe) {
        System.out.println("\nLista de poderes:");

        String[] listaPoderes = superheroe[nSuperheroe].getListaPoderes();

        for (int i = 0;i < 4;i++) {
            System.out.println(listaPoderes[i]);
        }
    }

    //Opcion 5 Consultar poder
    //Este muestra el poder del tipo elegigo y informacion de este
    //Si no tiene el poder se mostrara el numero de la categoria sin contenido
    public static void verPoder(int nSuperheroe) {
        verListaPoderes(nSuperheroe);

        System.out.println("\nQue tipo de poder quieres consultar");

        int tipoSuperpoder = -1;
        
        do {
            tipoSuperpoder = escribirNumero();
            //Mensaje de error si esta fuera de rango
            if ((tipoSuperpoder < 1) || (tipoSuperpoder > 4)) {
                System.out.println("Solo es posible elegir entre los tipos de poderes 1 al 4");
            }
        } while ((tipoSuperpoder < 1) || (tipoSuperpoder > 4));

        System.out.println(superheroe[nSuperheroe].getPoder(tipoSuperpoder));
    }

    //Opcion 6 Usar poder
    //Elige el poder y despues da un mensaje acorde de el tipo de poder
    //Si no tiene el poder o no tiene la energia necesario, dará un mensaje de error
    public static void usarPoder(int nSuperheroe) {
        verListaPoderes(nSuperheroe);
        
        System.out.println("\nQue tipo de poder quieres usar");

        int tipoSuperpoder = -1,valor = 0;

        do {
            tipoSuperpoder = escribirNumero();
            //Mensaje de error si esta fuera de rango
            if ((tipoSuperpoder < 1) || (tipoSuperpoder > 4)) {
                System.out.println("Solo es posible elegir entre los tipos 1 hasta 4");
            }
        } while ((tipoSuperpoder < 1) || (tipoSuperpoder > 4));

        switch (tipoSuperpoder) {
            case 1:
                System.out.println("Cuanto tiempo quieres volar");
                do {
                    valor = escribirNumero();
                    //Mensaje de error si esta fuera de rango
                    if (valor < 0) {
                        System.out.println("Solo es posible valores positivos");
                    }
                } while (valor < 0);
                break;
            case 2:
                System.out.println("Cuanta fuerza quieres usar");
                do {
                    valor = escribirNumero();
                    //Mensaje de error si esta fuera de rango
                    if (valor < 0) {
                        System.out.println("Solo es posible valores positivos");
                    }
                } while (valor < 0);
                break;
            case 3:
                System.out.println("Que echizo quieres realizar");
                do {
                    valor = escribirNumero();
                    //Mensaje de error si esta fuera de rango
                    if ((valor < 1) || (valor > 8)) {
                        System.out.println("Solo puedes elegir entre los echizos 1 al 8 ");
                    }
                } while ((valor < 1) || (valor > 8));
                break;
            case 4:
                System.out.println("Cuantos kilos quieres mover");
                do {
                    valor = escribirNumero();
                    //Mensaje de error si esta fuera de rango
                    if (valor < 0) {
                        System.out.println("Solo es posible valores positivos");
                    }
                } while (valor < 0);
                break;
            default:
                break;
        }

        if (!superheroe[nSuperheroe].usarPoder(tipoSuperpoder,valor)) {
            System.out.println("Lo sentimos, no ha sido posible usar ese poder");
        }
    }

    //Opcion 7 Descansar
    public static void descansar(int nSuperheroe) {
        System.out.println("\nCuanto tiempo deseas descansar");

        int tiempo = -1;

        do {
            tiempo = escribirNumero();
            //Mensaje de error si esta fuera de rango
            if (tiempo  < 0) {
                System.out.println("El tiempo deve de ser un valor positivo");
            }
        }
        while (tiempo  < 0);

        superheroe[nSuperheroe].descansar(tiempo);
    }

    //Opcion 8 Lista superheroes
    //Muestra una lista con los superheroes creados hasta ahora
    public static void listaSuperheroes() {
        System.out.println("\nLista de superheroes");

        for (int i = 1;i < numSuperheroe;i++) {
            System.out.println(i + " - " + superheroe[i].getNombre());
        }
    }
}