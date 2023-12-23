public class Estadistica {
    
    public final int LONG = 10;
    private int i = 0,ac = 0;
    private double media;
    private StringBuilder menor = new StringBuilder();
    private StringBuilder mayor = new StringBuilder();
    private int[] numeros = new int[LONG];

    // guarda todos los numeros en un array
    public void setNumero(int a) {
        numeros[i] = a;
        i++;
    }
    // calcula la media
    public double media() {
        for (int i = 0;i < LONG;i++) {
            ac = ac + numeros[i];
        }
        media = ac / LONG;

        this.calculo();

        return media;
    }
    // calcula si es mayor o menor y lo guarda en un string para cada tipo
    private void calculo(){
        for (int i = 0;i < LONG;i++) {
            if (numeros[i] > media) {
                mayor.append(numeros[i] + " ");
            }
            else if (numeros[i] < media) {
                menor.append(numeros[i] + " ");
            }
        }
    }
    // muestra los numeros mayores que la media
    public String mayorMedia(){
        return mayor.toString();
    }
    // muestra los numeros menores que la media
    public String menorMedia(){
        return menor.toString();
    }
}
