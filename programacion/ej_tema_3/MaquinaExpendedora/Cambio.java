public class Cambio {
    
    private double intro;
    private int i;

    StringBuilder cambio = new StringBuilder(); // creo un stringbuilder

    public void setCambio(double a){
        intro = a;
        this.euros2();
    }

    // metodo que comprueba si puede darte cambio con monedas de dos euros
    private void euros2(){

        i = 0;

        while (intro >= 2) {
            i++;
            intro = intro - 2;
        }

        if (i > 0) {cambio.append(i + " de 2 euros\n");}

        this.euros1();
    }
    // metodo que comprueba si puede darte cambio con monedas de un euros
    private void euros1(){

        i = 0;

        while (intro >= 1) {
           i++;
            intro = intro - 1;
        }

        if (i > 0) {cambio.append(i + " de 1 euros\n");}

        this.cent50();
    }
    // metodo que comprueba si puede darte cambio con monedas de 50 centimos
    private void cent50(){
        
        i = 0;

        while (intro >= 0.5) {
            i++;
            intro = intro - 0.5;
        }

        if (i > 0) {cambio.append(i + " de 50 cent\n");}

        this.cent20();        
    }
    // metodo que comprueba si puede darte cambio con monedas de 20 centimos
    private void cent20(){
        
        i = 0;

        while (intro >= 0.2) {
            i++;
            intro = intro - 0.2;
        }

        if (i > 0) {cambio.append(i + " de 20 cent\n");}
        
        this.cent10();
    }
    // metodo que comprueba si puede darte cambio con monedas de 10 centimos
    private void cent10(){
        
        i = 0;

        while (intro >= 0.1) {
            i++;
            intro = intro - 0.1;
        }
        
        if (i > 0) {cambio.append(i + " de 10 cent\n");}

        this.cent5();
    }
    // metodo que comprueba si puede darte cambio con monedas de 5 centimos
    private void cent5(){
        
        i = 0;

        while (intro >= 0.05) {
            i++;
            intro = intro - 0.05;
        }
        
        if (i > 0) {cambio.append(i + " de 5 cent\n");}

        this.cent2();
    }
    // metodo que comprueba si puede darte cambio con monedas de 2 centimos
    private void cent2(){
        
        i = 0;

        while (intro >= 0.02) {
            i++;
            intro = intro - 0.02;
        }
        
        if (i > 0) {cambio.append(i + " de 2 cent\n");}

        this.cent1();
    }
    // metodo que comprueba si puede darte cambio con monedas de 1 centimos
    private void cent1(){

        i = 0;

        while (intro >= 0.01) {
            i++;
            intro = intro - 0.01;
        }

        if (i > 0) {cambio.append(i + " de 1 cent");}
    }
    // muestro el cambio con este metodo
    public String getCambio(){
        return cambio.toString();
    }
}
