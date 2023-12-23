// Este programa hace la media de numeros que tu le des
public class Acomulador {
    private int num,res = 0,i = 0;
    boolean positivo;

    public void setNumero(int a){
        num = a;
    }

    // este algoridomo mira si es positivo i si es asi llama a suma
    public boolean positivo(){
        if(num >= 0){
            positivo = true;
            this.suma();
        }
        else positivo = false;
        
        return positivo;
    }
    //este algoridmo suma los numeros y incrementa el iterador
    public int suma(){
        i++;
        res = res + num;
        return res;
    }
    // este algoridmo realiza la media de la suma de los numeros
    public int media(){
        res = res / i;
        return res;
    }
}
