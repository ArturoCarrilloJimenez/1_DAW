public class Nomina {

    private double phora,horas,hextras,hextras2,salario;

    public void setNumero (double a, double b) {
        phora = a;
        horas = b;
        this.horasExtras();
    }

    // calcula las horas extras
    private void horasExtras(){
        if (horas >= 40) {
            hextras = horas - 40;
            horas = horas - hextras;
        }
    }

    // calcula salario bruto
    public double sueldoBruto(){

        salario = horas * phora;

        if (hextras > 0) {
            if (hextras > 5) { // si las horas extras superan las 5 horas este hara que las primera las cobra a 1.5 de su suldo y el resto al doble

                hextras2 = hextras - 5;
                hextras = hextras - hextras2;

                salario = (salario + (hextras2 * (1.5 * phora)));
                salario = (salario + (hextras * (2 * phora)));
            }
            else{ // si tiene menos de 5 horas extras este los calculas por 1.5 el precio
            salario = (salario + (hextras * (1.5 * phora)));
            }
        }

        return salario;
    }

    // este calcula los inpuestos
    public double sueldoNeto(){
        // si cobra mas de 1000 se le quita un 15% y si cobra menos un 10%
        if (salario >= 1000) {
            salario = (salario - (salario * 0.15));
        }
        else {
            salario = (salario - (salario * 0.1));
        }
        return salario;
    }
}