package OOPOngkosKirim;

public class HitungOngkos {

    HitungOngkos(){
    }
    // rumus dimensi
    public double volume (int p, int l, int t, Object dimensi){
        int biayaPerKg = 5000;
        return dimensi ( p * l * t / biayaPerKg);
    }

    private double dimensi(int i) {
        return 0;
    }
    // rumus biaya per KG
    public  double biaya ( int berat,int biayaPerKg){
       // int biayaPerKg = 5000;
        return ( berat * biayaPerKg );

    }

}
