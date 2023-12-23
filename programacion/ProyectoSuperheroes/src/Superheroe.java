public class Superheroe {
    
    private String nombre;

    //Creao un array de objetos
    //Tiene 5 posiciones pero solo se usuaran las posiciones del 1 al 4
    private Superpoder[] listaSuperpoderes = new Superpoder[5];

    public Superheroe(String nombre) {
        this.nombre = nombre;

        //Inicializo el array a null
        for (int i = 0;i < 5;i++) {
            listaSuperpoderes[i] = null;
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Agrega un superpoder en una posicion preasignada en el array
    public boolean agregarPoder(String nombre,String decripcion,int tipo){

        boolean poderCreado = true;

        if ((tipo >= 1) && (tipo <= 4)) {
            if (listaSuperpoderes[tipo] == null) {
                switch (tipo) {
                    case 1:
                        listaSuperpoderes[tipo] = new SuperpoderVuelo(nombre,decripcion,100);
                        break;
                    case 2:
                        listaSuperpoderes[tipo] = new SuperpoderFuerza(nombre,decripcion,100);
                        break;
                    case 3:
                        listaSuperpoderes[tipo] = new SuperpoderMagia(nombre,decripcion,100);
                        break;
                    case 4:
                        listaSuperpoderes[tipo] = new SuperpoderTelequinesis(nombre,decripcion,100);
                        break;
                    default:
                        poderCreado = false;
                }
            }
            else {poderCreado = false;}
        }
        else {poderCreado = false;}

        return poderCreado;
    }

    //Elimino un poder canviando lo que alla a null
    public boolean eliminarPoder(int tipo){
        boolean eliminarPoder;

        if (listaSuperpoderes[tipo] != null) {
            listaSuperpoderes[tipo] = null;
            eliminarPoder = true;
        }
        else {eliminarPoder = false;}

        return eliminarPoder;
    }

    //Devuelve una lista con los superpoderes que tiene
    public String[] getListaPoderes(){
        String[] listaPoderes = new String[4];

        for (int i = 0,j = 1;i < 4;i++,j++) {
            if (listaSuperpoderes[j] != null) {
                switch (j) {
                    case 1:
                        listaPoderes[i] = ("1 - " + listaSuperpoderes[j].getNombre() + " tipo Vuelo");
                        break;
                    case 2:
                        listaPoderes[i] = ("2 - " + listaSuperpoderes[j].getNombre() + " tipo Fuerza");
                        break;
                    case 3:
                        listaPoderes[i] = ("3 - " + listaSuperpoderes[j].getNombre() + " tipo Magia");
                        break;
                    case 4:
                        listaPoderes[i] = ("4 - "  + listaSuperpoderes[j].getNombre() + " tipo Telequinesis");
                        break;
                }
            }
            else {listaPoderes[i] = (j + " - ");}
        }

        return listaPoderes;
    }

    //Devuelve el poder del tipo indicado si lo posee
    public String getPoder(int tipo){

        String poder = (tipo + " - ");

        if (listaSuperpoderes[tipo] != null) {
            switch (tipo) {
                case 1:
                    poder = ("1 - " + listaSuperpoderes[tipo].getNombre() + "\nTipo Vuelo\nDescripcion " + listaSuperpoderes[tipo].getDescripcion() + "\nNivel de energia " +  listaSuperpoderes[tipo].getEnergia());
                    break; 
                case 2:
                    poder = ("2 - " + listaSuperpoderes[tipo].getNombre() + "\nTipo Fuerza\nDescripcion " + listaSuperpoderes[tipo].getDescripcion() + "\nNivel de energia " +  listaSuperpoderes[tipo].getEnergia());
                    break;
                case 3:
                    poder = ("3 - " + listaSuperpoderes[tipo].getNombre() + "\nTipo Magia\nDescripcion " + listaSuperpoderes[tipo].getDescripcion() + "\nNivel de energia " +  listaSuperpoderes[tipo].getEnergia());
                    break;
                case 4:
                    poder = ("4 - " + listaSuperpoderes[tipo].getNombre() + "\nTipo Telequinesis\nDescripcion " + listaSuperpoderes[tipo].getDescripcion() + "\nNivel de energia " +  listaSuperpoderes[tipo].getEnergia());
                    break;
            }
        }
        return poder;
    }

    //Descansa para recuperar energia
    //1 min = 1 energia
    public void descansar(int minutos){
        if (listaSuperpoderes[1] != null) {listaSuperpoderes[1].descansar(minutos);}
        if (listaSuperpoderes[2] != null) {listaSuperpoderes[2].descansar(minutos);}
        if (listaSuperpoderes[3] != null) {listaSuperpoderes[3].descansar(minutos);}
        if (listaSuperpoderes[4] != null) {listaSuperpoderes[4].descansar(minutos);}
    }

    //Metodo para usar poder en caso de que exista el poder
    public boolean usarPoder(int tipo,int volar) {
        if (listaSuperpoderes[tipo] != null) {
            return listaSuperpoderes[tipo].usarPoder(volar);
        }
        return false;
    }
}