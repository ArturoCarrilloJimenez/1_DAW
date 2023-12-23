public class NotaClase {
    
    private double num;
    private int ap = 0,sp = 0;

    public void setNumero(double n){
        num = n;
        this.verNota();
    }

    // este subalgoridmo comprueva si esta aprobado o suspenso y añade al acomulador requerido 1 
    private void verNota(){
        if(num >= 5) ap++;
        else sp++;
    }
    // muestra el nº de aprobados
    public int getNumAprobados(){
        return ap;
    }
    // muestra el nº de suspensos
    public int getNumSuspensos(){
        return sp;
    }
}
