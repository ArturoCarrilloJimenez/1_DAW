public class Distancia {
    
    private double dist,milla = 1852 ;

    public void setDistancia(double d){
        dist = d;
    }

    public double millasMetros(){
        return(dist * milla);
    }
    public double millasKilometros(){
        return(dist / 0.62137);
    }
}
