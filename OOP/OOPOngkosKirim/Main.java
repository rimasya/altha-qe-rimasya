package OOPOngkosKirim;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args) {
        HitungOngkos xhitung;
        int p, l, t;
        int berat;
        int biayaPerKg = 5000;

        xhitung = new HitungOngkos();

        //Output untuk input panjang , lebar dan tinggi dimensi
        System.out.println("=================");
        System.out.println("Program Hitung Ongkos Kirim");
        System.out.println("=================");
        System.out.println("Masukan Panjang DImensi");
        p = scanner.nextInt();
        System.out.println("Masukan Lebar Dimensi");
        l = scanner.nextInt();

        //output untuk input berat barang
        System.out.println("Masukan Tinggi Dimensi");
        t = scanner.nextInt();
        Object dimensi = null;
        System.out.println("Hasil : " + xhitung.volume(p, l, t,dimensi)); // output hasil dimensi
        System.out.println("=================");
        System.out.println("Masukan Berat Barang");
        berat = scanner.nextInt();
        System.out.println("Harga : " + xhitung.biaya(berat,biayaPerKg)); // output hasil ongkos kirim
    }
}
