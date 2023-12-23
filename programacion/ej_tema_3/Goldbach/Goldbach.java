public class Goldbach {

    private int[] primo;
    private int num,c = 0,j = 0;

    private void primos() {
        do {
            int div = num;
        
            do{
                if ((num % div) == 0) {c++;}
                div--;
            }
            while (div > 0);

            if (c <= 2) {
                primo[j] = num;
                j++;
            }
            else {
                primo[j] = 0;
                j++;
            }

            num--;
            c = 0;
        } while (num > 0);
    }
    public String suma(int a) {
        num = a;
        primo = new int[a];
        this.primos();

        System.out.println(a);
        for (int i = 0; i < a; i++) {
            System.out.print(primo[i] + " | ");
        }
        System.out.println();

        StringBuilder suma = new StringBuilder();
        boolean salir = false;

        int i = 0,j = 0;

        do {
            do {
                if ((primo[i] + primo[j])  == a) {
                    suma.append(primo[i] + " + " + primo[j]);
                    salir = true;
                    break;
                }
                j++;
            } while ((j != a));
            i++;
            j = 0;
        } while ((salir != true));

        return suma.toString();
    }
}
