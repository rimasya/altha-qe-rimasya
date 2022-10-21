package OOPBangunRuang;

public class Kubus implements BangunRuang {

    Kubus(){

    }

    @Override
    public double volume ( int s) {
        return ( s * s * s );
    }

    @Override
    public double volume(int p, int l, int t) {
        return 0;
    }

    @Override
    public double volume(int r, int ti) {
        return 0;
    }

//    @Override
//    public double volume(int s, int p, int l, int r, int ti) {
//        return 0;
//    }
    //    @Override
//    public double volume(int p, int l, int t, int s, int r, int ti) {
//        return 0;
//    }
}
