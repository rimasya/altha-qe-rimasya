package OOPKalkulator;

import java.util.Scanner;
public class Main {
    public  static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        Pengurangan xpengurangan;
        Penjumlahan xpenjumlahan;
        Perkalian xperkalian;
        Pembagian xpembagian;
        int bil1,bil2;

        xpengurangan = new Pengurangan();
        xpenjumlahan = new Penjumlahan();
        xperkalian = new Perkalian();
        xpembagian = new Pembagian();

        mainMenu();
        //kondisi
        switch (pilihan){
            case '1':{
                System.out.println("=================");
                System.out.println("Masukan Angka pertama");
                bil1 =scanner.nextInt();
                System.out.println("Masukan Angka Kedua");
                bil2 =scanner.nextInt();
                System.out.println("Hasil : " + xpengurangan.hitung(bil1,bil2));
                break;
            }
            case '2':{
                System.out.println("=================");
                System.out.println("Masukan Angka pertama");
                bil1 =scanner.nextInt();
                System.out.println("Masukan Angka Kedua");
                bil2 =scanner.nextInt();
                System.out.println("Hasil : " + xpenjumlahan.hitung(bil1,bil2));
                break;
            }
            case '3':{
                System.out.println("=================");
                System.out.println("Masukan Angka pertama");
                bil1 =scanner.nextInt();
                System.out.println("Masukan Angka Kedua");
                bil2 =scanner.nextInt();
                System.out.println("Hasil : " + xperkalian.hitung(bil1,bil2));
                break;
            }
            case '4':{
                System.out.println("=================");
                System.out.println("Masukan Angka pertama");
                bil1 =scanner.nextInt();
                System.out.println("Masukan Angka Kedua");
                bil2 =scanner.nextInt();
                System.out.println("Hasil : " + xpembagian.hitung(bil1,bil2));
                break;
            }
            default:{
                System.out.println("Tidak ada pilihan");
                break;
            }
        }
    }
    private static void mainMenu(){
        //pilihan menu
        System.out.println("==================");
        System.out.println("Program Bangun Ruang");
        System.out.println("====================");
        System.out.println("1.Pengurangan");
        System.out.println("2.Penjumlahan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("Masukan Pilihan : ");
        pilihan = scanner.next().charAt(0);
    }
}
