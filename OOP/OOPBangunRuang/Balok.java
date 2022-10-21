package OOPBangunRuang;

public class Balok implements BangunRuang{

    Balok(){
    }

    @Override
    public double volume(int s) {
        return 0;
    }

    @Override
    public double volume(int p, int l, int t) {
        return ( p * l * t);
    }

    @Override
    public double volume(int r, int ti) {
        return 0;
    }


}
