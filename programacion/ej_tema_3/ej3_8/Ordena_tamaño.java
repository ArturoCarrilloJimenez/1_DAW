public class Ordena_tamaño {

    private int num1, num2, num3,mayor,menor,mediano;

    // Con el set le doi valor a las variable
    public void setNumero1(int a){
        num1 = a;
    }
    public void setNumero2(int b){
        num2 = b;
    }
    public void setNumero3(int c){
        num3 = c;
    }

    // Mira que numero es el mayor
    public int saberMayor(){
       if((num1 > num2) & (num1 > num3))mayor = num1;
       else if((num2 > num1) & (num2 > num3))mayor = num2;
       else mayor = num3;

       return mayor;
    }
    // Mira que numero es el menor
    public int saberMenor(){
       if((num1 < num2) & (num1 < num3))menor = num1;
       else if((num2 < num1) & (num2 < num3))menor = num2;
       else mayor = num3;
       
       return menor;
    }
    // Mira que numero es el mediano
    public int saberMediano(){
        if(((mayor == num1) || (mayor == num3)) & ((menor == num1) || (menor == num3)))mediano = num2;
        else if(((mayor == num2) || (mayor == num3)) & ((menor == num2) || (menor == num3)))mediano = num1;
        else mediano = num3;
        return mediano;
    }
}
