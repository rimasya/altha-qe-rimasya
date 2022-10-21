package JavaPart2;

import java.util.Scanner;

public class DrawXYZ {
    public static void main(String[] args) {
//        int a;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Masukkan sebuah bilangan : ");
////        a = scan.nextInt();
//        for (int a=2; a<=30; a+=2) {
//            System.out.print("Bilangan " + a + " X.\n");
//        } for (int a=1; a<=30; a++){
//            System.out.print("Bilangan " + a + " Y.\n");
//        } else ( a = 3; a % 5 !== 0){
//            System.out.print("Bilangan " + a + " Z.\n");
//        }
//    }
//        for (int i = 3; i <= 30; i += 3) {
//            if (i % 5 != 0) {
//                System.out.println(i);
//            }
////        }
//        }
        Scanner baca = new Scanner(System.in);
        int masuk, lanjut;
        String gangen, prime = "Tidak Prima";
        int jumlah_deret,i;
        do {
            System.out.print("Masukkan Angka : ");
            masuk = baca.nextInt();
            if (masuk % 2 == 0) {
                gangen = "Y";
            } else {
                gangen = "X";
            }
            if (masuk >= 2) {
                prime = "Prima";
                for (int x = 2; x < masuk; x++) {
                    if (masuk % x == 0) {
                        prime = "Z";
                        break;
                    }
                }
            }
            System.out.println(masuk + " Termasuk Bilangan " + gangen + " dan " + prime);
            System.out.print("Lanjut (0/1)?");
            lanjut = baca.nextInt();
        } while (lanjut != 0);
        System.out.println("Bye Bye");
    }
}
