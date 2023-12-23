class caracter{
    public static char getVocal() {

    char car = ' ';
    int aleat = 0;

    aleat = (int) (Math.random() * 10);

    if (aleat == 0) car = 'a';
    if (aleat == 1) car = 'e';
    if (aleat == 2) car = 'i';
    if (aleat == 3) car = 'o';
    if (aleat == 4) car = 'u';
    if (aleat == 5) car = 'A';
    if (aleat == 6) car = 'E';
    if (aleat == 7) car = 'I';
    if (aleat == 8) car = 'O';
    if (aleat == 9) car = 'U';

    return car;
    }
    
    public static void main(String[] args) {
    System.out.println(getVocal());
    System.out.println(getVocal());
    System.out.println(getVocal());
    System.out.println(getVocal());
    }
}