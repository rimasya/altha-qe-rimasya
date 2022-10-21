package OOPBangunRuang;

public class Tabung implements BangunRuang {

    Tabung() {

    }
    @Override
    public double volume(int s) {
        return 0;
    }
    @Override
    public double volume(int p, int l, int t) {
        return 0;
    }
    @Override
    public double volume(int r, int ti) {
        double phi = 3.142857142857143;
        return (phi * r * r * ti);

    }
}
