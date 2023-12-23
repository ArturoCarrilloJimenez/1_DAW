public class Tabla {
    private int num1,num2,res;

    public void setNumero1(int a){num1 = a;}// Numero para hacer la tabla
    public void setNumero2(int a){num2 = a;}// Numero hassta la que hace la tabla

    public String tablaMultiplicar(){
        StringBuilder tabla = new StringBuilder();

        int i = 0 ;
            while(num2 > i){
                i++;
                res = num1 * i;
                tabla.append(num1 + " * " + i + " = " + res + "\n");
            }
        return tabla.toString();
    }
}
