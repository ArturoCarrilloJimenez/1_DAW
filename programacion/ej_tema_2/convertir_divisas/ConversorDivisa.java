//Coneveror monedas con setters
public class ConversorDivisa {

    private double divEu, divLib;

    public void setEuros(double e){
        divEu = e;
    }
        public void setLibras(double l){
        divLib = l;
    }

    //Convierte las libras en euro
    public double librasToEuro(){
        return(divEu / 0.87);
    }
    //Convierte los euros en libras
    public double euroToLibra(){
        return(divLib * 0.87);
    }
}
