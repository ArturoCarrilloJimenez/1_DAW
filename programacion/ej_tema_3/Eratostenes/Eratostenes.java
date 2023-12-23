public class Eratostenes {
        
    private int num,div,c;
    private boolean primo;

    public void setNumero(int a){
        num = a;
        this.dividirNumero();
    }

    private void dividirNumero(){

        div = num;
        c = 0;

        // este bucle divide de forma recurrente asta que el divisor llega a 0
        do{
            if ((num % div) == 0) {c++;}
            div--;
        }
        while (div > 0);
    }
    public boolean getPrimo(){

        if (c <= 2) {primo = true;}
        else{primo = false;}

        return primo;
    }
}
