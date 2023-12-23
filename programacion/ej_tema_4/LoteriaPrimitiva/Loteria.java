public class Loteria {
    
    private int[] loto = new int[6];

    private void numAleatorio(){
        for (int i = 0;i < 6;i++) {
            loto[i] = (int)((Math.random()*49) + 1);
            int j = 0;
            while (j < i) {
                if (loto[i] == loto[j]) {
                    loto[i] = (int)((Math.random()*49) + 1);
                    j = -1;
                }
                j++;
            }
        }
    }
    public int[] resultado(){
        this.numAleatorio();
        return loto;
    }
}
