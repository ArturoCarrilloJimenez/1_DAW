public class Peso{
    private double peso,tipo;
    
    public void setTipo(int t){
        tipo = t;
    }
    public void setPeso(double p){
        peso = p;
        this.pasarGramos();
    }
    
    // comprievo a que unidad este el peso y lo paso a gramos
    // 1 == libras , 2 == onzas, 3 == kilos, 4 == gramos
    private void pasarGramos(){
        if(tipo == 1) peso = peso / 0.0022046;//libras a grmo
        else if(tipo == 2) peso = peso * 0.035274;// onzas a gramo
        else if(tipo == 3) peso = peso / 0.001; // kilo a grmo
        else peso = peso;// gramo
    }

    public double pasarLibras(){
        return(peso * 0.0022046);
    }
    public double pasarKilos(){
        return(peso * 1000.0);
    }
    public double pasarOnzas(){
        return(peso / 0.035274);
    }
}