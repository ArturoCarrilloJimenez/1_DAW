public class MiNumero {

    private int num1,num2;
    
    //Llama a n1 y lo guarda en num1
    public void setNumero1(int n1){
        num1 = n1;
    }
    //Llama a n2 y lo guarda en num3
    public void setNumero2(int n2){
        num2 = n2;
    }

    //Subalgoridmos que duplica,triplica,cuadriplica,suma y resta
    public int dobleNumero(){
        return(num1 * 2);
    }
    public int tripleNumero(){
        return(num1 * 3);
    }
    public int cuadrupeNumero(){
        return(num1 * 4);
    }
    public int sumaNumeros(){
        return(num1 + num2);
    }
        public int restaNumeros(){
        return(num1 - num2);
    }
}
