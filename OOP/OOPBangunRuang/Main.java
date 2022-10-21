package OOPBangunRuang;

import java.util.Scanner;

public class Main {
    public  static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String [] args){
        Kubus xkubus;
        Balok xbalok;
        Tabung xtabung;
        int p,l,t;
        int s;
        int r,ti;

        xkubus = new Kubus();
        xbalok = new Balok();
        xtabung = new Tabung();

        mainMenu();
        //kondisi
        switch (pilihan){
            case '1':{
                System.out.println("=================");
                System.out.println("Masukan Sisi Balok");
                s =scanner.nextInt();
                System.out.println("Luas Kubus : " + xkubus.volume(s));
                break;
            }
            case '2':{
                System.out.println("=================");
                System.out.println("Masukan Panjang Balok");
                p =scanner.nextInt();
                System.out.println("Masukan Lebar Balok");
                l=scanner.nextInt();
                System.out.println("Masukan tinggi Balok");
                t=scanner.nextInt();
                System.out.println("Volume Balok : " + xbalok.volume(p,l,t));
                break;
            }
            case '3':{
                System.out.println("=================");
                System.out.println("Masukan Diameter Tabung");
                r =scanner.nextInt();
                System.out.println("Masukan Tinggi Tabung ");
                ti=scanner.nextInt();
                System.out.println("Volume Tabung : " + xtabung.volume(r,ti));
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
        System.out.println("1.Kubus");
        System.out.println("2.Balok");
        System.out.println("3.Tabung");
        System.out.println("Masukan Pilihan : ");
        pilihan = scanner.next().charAt(0);
    }
}

