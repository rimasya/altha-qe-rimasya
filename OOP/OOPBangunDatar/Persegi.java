package OOPBangunDatar;

public class Persegi implements BangunDatar{
    Persegi(){

    }

    @Override
    public double luas (int s1,int s2) {

        return (s1 * s1);
    }
    @Override
    public double keliling (int s1, int s2){
        return (4 * s1);
    }
}
