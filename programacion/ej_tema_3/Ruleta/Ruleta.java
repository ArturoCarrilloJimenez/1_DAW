public class Ruleta {
    
    private int saldo,num,color,apuesta,numPremio,colorPremio;

    public void setSaldo (int a){
        saldo = a;
    }
    public void setApuesta(int a, String b, int c) {
        num = a;

        switch (b) {
            case "negro":
                color = 1;
                break;
            case "rojo":
                color = 2;
                break;
        }

        apuesta = c;

        numPremio = (int)(Math.random()*37);

        this.colorPremio();
        this.calcularJugada();
    }

    // muestra el sueldo
    public int saldo(){
        return saldo;
    }
    // calcula el color del numero aleatorio
    private int  colorPremio(){
        if (numPremio == 0) {
            colorPremio = 0; // color verde
        }
        else if ((numPremio % 2) == 0) {
            colorPremio = 2; // color rojo
        }
        else {
            colorPremio = 1; // color negro
        }

        return numPremio;
    }
    // calculo jugada
    // no acierta pierde apuesta
    // acierta num y sale 0 multiplica por 14
    // acierta color y num multiplica por 10
    // acierta num multiplica por 5
    // acierta color multiplica por 2
    private void calcularJugada(){
        saldo = saldo - apuesta;

        if (((num == numPremio) && (numPremio == 0))) {
            saldo = saldo + (apuesta * 14);
        }
        else if ((color == colorPremio) && (num == numPremio)) {
            saldo = saldo + (apuesta * 10);
        }
        else if (num == numPremio) {
            saldo = saldo + (apuesta * 5);
        }
        else if (color == colorPremio) {
            saldo = saldo + (apuesta * 2);
        }
    }
    // muestra el numero y color
    public String numeroColorPremio(){
        StringBuilder premio = new StringBuilder();

        premio = premio.append(numPremio + " ");

        switch (colorPremio) {
            case 1:
                premio = premio.append("negro");
                break;
            case 2:
                premio = premio.append("rojo");
                break;
        }
        return premio.toString();
    }
}