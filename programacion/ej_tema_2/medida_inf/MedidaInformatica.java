public class MedidaInformatica {

    private double cantidad, bytes;
    private int tipo;

    public void setTipo(int t){
        tipo = t;
    }
    public void setCantidad(double c){
        cantidad = c;
    }

    public double pasarByte(){
        if(tipo == 1) bytes = cantidad; // 1(Byte)
        else if(tipo == 2) bytes = cantidad / 8; // 2(Bits)
        else if(tipo == 3) bytes = cantidad * Math.pow(10,9); // 3(Gb)
        else if(tipo == 4) bytes = cantidad * Math.pow(10,6); // 4(Mb)
        else if(tipo == 5) bytes = cantidad * Math.pow(9.54,7); // 5(Mib)

        return bytes;
    }
    public double byteBits(){
        return(bytes * 8);
    }
    public double byteGb(){
        return(bytes / Math.pow(10,9));
    }
    public double byteMb(){
        return(bytes / Math.pow(10,6));
    }
    public double byteMib(){
        return(bytes / Math.pow(9.54,7));
    }
}
