package OOPBangunDatar;

import java.util.Scanner;
// proses output
public class Main {

    public  static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        Persegi xpersegi;
        Segitiga xsegitiga;
        PersegiPanjang xpersegipanjang;
        int s1,s2 = 0;

        xpersegi = new Persegi();
        xsegitiga = new Segitiga();
        xpersegipanjang = new PersegiPanjang();
        Scanner baca = new Scanner(System.in);
        int lanjut;


        mainMenu();
        //kondisi
        switch (pilihan){
            case '1':{
                System.out.println("=================");
                System.out.println("Masukan Sisi Persegi");
                s1 =scanner.nextInt();
                System.out.println("Luas Persegi : " + xpersegi.luas(s1,s2));
                System.out.println("Keliling Segitiga " + xpersegi.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.println("=================");
                System.out.println("Masukan Alas Segitiga");
                s1 =scanner.nextInt();
                System.out.println("Masukan Tinggi Segitiga");
                s2=scanner.nextInt();
                System.out.println("Luas Segitiga : " + xsegitiga.luas(s1,s2));
                System.out.println("Keliling Segitiga " + xsegitiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.println("=================");
                System.out.println("Masukan Panjang");
                s1 =scanner.nextInt();
                System.out.println("Masukan Lebar ");
                s2=scanner.nextInt();
                System.out.println("Luas Persegi Panjang : " + xpersegipanjang.luas(s1,s2));
                System.out.println("Keliling Persegi Panjang " + xpersegipanjang.keliling(s1,s2));
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
        System.out.println("Program Bangun Datar");
        System.out.println("====================");
        System.out.println("1.Persegi");
        System.out.println("2.Segitiga");
        System.out.println("3.PersegiPanjang");
        System.out.println("Masukan Pilihan : ");
        pilihan = scanner.next().charAt(0);


    }
}
