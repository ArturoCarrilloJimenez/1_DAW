public class Estadistica {
    private int num,my = 0,mn = Integer.MAX_VALUE,ac = 0;
    private double media;

    public void setNumero(int a){
        num = a;
        this.getMayor();
        this.getMenor();
        this.acomoularNum();
    }

    //este subalgoridmo muestra el numero mayor
    public int getMayor(){
        if(my < num){my = num;}
        return my;
    }
    //este subalgoridmo muestra el numero menor
    public int getMenor(){
        if(mn > num){mn = num;}
        return mn;
    }
    //este subalgoridmo suma todos los numeros para despues acer la media
    private int acomoularNum(){
        ac = ac + num;
        return ac;
    }
    //este subalgoridmo coje el acomulador de los numeros y lo divide entre 10 para sacar la media
    public double getMedia(){
        media = (double)ac / 10;
        return media;
    }
}
