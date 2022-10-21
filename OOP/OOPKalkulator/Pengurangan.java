package OOPKalkulator;

public class Pengurangan implements Kalkulator {

    Pengurangan(){

    }

    @Override
    public double hitung(int bil1, int bil2) {
        return ( bil1 - bil2);
    }
}
