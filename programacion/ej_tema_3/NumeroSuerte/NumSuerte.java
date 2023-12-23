public class NumSuerte {
    
    private int d,m,a,sum,num,n1;

    public void setNumero(int x, int y, int z){
        d = x;
        m = y;
        a = z;
        this.sumaFecha();
    }

    // sumo todos los numeros y los meto en sum
    private void sumaFecha(){
        sum = d + m + a;
    }
    public int descomponerNum(){

        // ejecuto este bucle asta que sum sea menor que 10
        do {

            // defino el itinerador, el numero que va a descomponer y reseteo la suma
            int i = 0;
            num = sum;
            sum = 0;

            // esto lo hago 5 veces
            // hago que descomponga el numero, sume el resto de 10 y divida entre 10 para quitar una cifra
            while (i <= 4) {
                n1 = num % 10;

                sum = sum + n1;

                num = num / 10;

                i++;
            }
        }
        while (sum >= 10); // compruebo si el numero es menor o igual de 10

        return sum;
    }
}
