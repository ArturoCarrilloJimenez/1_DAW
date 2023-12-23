public class Nim {
    private int palillos,monton,montonM,c = 0,ac;
    private boolean turno = false,cMonton,cPalillos,finJuego;
    private int[] montones = new int[3];

    // creo los montones
    private void crearMontones(){
        int i = 0;
        while (i < 3) {
            montones[i] = (int)((Math.random()*4) + 3);
            i++;
        }
    }
    // mustra el array con los montonrs
    public int[] mostrarMontones(){
        if (c == 0) {
            this.crearMontones();
            c++;
        }
        return montones;
    }
    // turno = true  ,elige la persona 
    // turno = false ,elige el programa
    public boolean turno(){
        if (turno == false) {turno = true;}
        else {turno = false;}
        return turno;
    }
    // elige el monton
    public int elegirMonton(int a){
        do {
            if (turno == false) {
                monton = (int)(Math.random()*3);
                montonM = monton + 1;
            }
            else {
                montonM = a;
                monton = montonM - 1;
            }
        } while (comprobarMonton() && (turno == false));

        return montonM;
    }
    // comprueba si el monton esta vacio
    public boolean comprobarMonton(){
        if (montones[monton] == 0) {cMonton = true;}
        else {cMonton = false;}
        return cMonton;
    }
    // elige la cantidad de palillos que quitar
    public int elegirPalillo(int a){
        
        if (turno == false) {
            do {palillos = (int)((Math.random()*2)+1);}
            while (comprobarPalillos());
        }
        else {palillos = a;}

        return palillos;
    }
    // comprueba si tiene los palillos necesarios para quitarlos
    public boolean comprobarPalillos(){
        if (montones[monton] < palillos) {cPalillos = true;}
        else {
            cPalillos = false;
            montones[monton] = montones[monton] - palillos;
        }
        return cPalillos;
    }
    // comprueba si quedan palillos en algun monton
    public boolean  comprobarFinJuego(){
        int i = 0;
        ac = 0;
        
        while (i < 3) {
            ac = ac + montones[i];
            i++;
        }

        if (ac != 0) {finJuego = true;}
        else {finJuego = false;}

        return finJuego;
    }
}