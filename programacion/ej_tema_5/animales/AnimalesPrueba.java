import java.util.Scanner;

public class AnimalesPrueba {
    public static void main(String[] args) {

        ContadorAnimales cont = new ContadorAnimales(); 
        Scanner sc = new Scanner(System.in);

        // creo objeto 1 y 2
        Animal animal = new Animal(null,0);
        Animal animal2 = new Animal(null,0);
        Perro perro = new Perro(null, 0, null);
        Gato gato = new Gato(null, 0);
        
        System.out.println("Animal 1");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        animal.setNombre(nombre);
        animal.setEdad(edad);

        sc.nextLine();

        System.out.println("Animal 2");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();

        animal2.setNombre(nombre2);
        animal2.setEdad(edad2);

        // muestro nombre de los animales
        System.out.println("\nNombre del primer animal: " + animal.getNombre());
        System.out.println("Nombre del segundo animal: " + animal2.getNombre()+"\n");

        // muestro edad de los animales
        System.out.println("Edad del primer animal: "+animal.getEdad());
        System.out.println("Edad del segundo animal: "+animal2.getEdad()+"\n");

        System.out.println("Se han creado " + cont.getContador() + " animales");
        sc.close();
    }
}
