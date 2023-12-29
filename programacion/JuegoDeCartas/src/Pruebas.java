public class Pruebas {
    public static void main(String[] args) {
        CartaPoker poker = new CartaPoker(12, 1);
        CartaEspanola espanola = new CartaEspanola(10, 1);
        CartaAlemana alemana = new CartaAlemana(11, 1);
        Baraja baraja = new Baraja(1);

        System.out.println("\n" + poker.toString());
        System.out.println(espanola.toString());
        System.out.println(alemana.toString());
        System.out.println(espanola.equals(alemana));

        espanola.clone(alemana);

        System.out.println(espanola.equals(alemana));
        baraja.barajar();

        for (int i = 0;i < 60;i++) {
            System.out.println(baraja.siguiente());
        }
    }
}
