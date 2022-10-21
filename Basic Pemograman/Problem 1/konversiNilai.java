package JavaPart1;

import java.util.Scanner;

import static JavaPart1.MainMenu.scanner;

public class konversiNilai {
    public static void main(String[] args) {
        int nilai;
        Scanner x = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Program Konversi Nilai Mahasiswa");
        System.out.println("=========================================");
        System.out.println("Masukkan Sebuah Nilai :");

        int a = x.nextInt();
        char coba;
        if (a >= 100) {
            System.out.println("Invalid");
        }else if (a >= 80 && a <= 100) {
            System.out.println("Nilai Anda A");
        } else if (a >= 65 && a <= 79) {
            System.out.println("Nilai Anda B+");
        } else if (a >= 50 && a <= 64) {
            System.out.println("Nilai Anda B");
        } else if (a >= 35 && a <= 49) {
            System.out.println("Nilai Anda C");
        }else if (a >= 0 && a <= 34) {
                System.out.println("Nilai Anda D");
        } else {
            System.out.println("Invalid");
        }
//        System.out.print("\nIngin mencoba lagi? (y/t) : ");
//        coba = scanner.next().charAt(0);
//        System.out.print("\n");
//        boolean b = coba == 'Y' || coba == 'y';
//            System.out.print("\n");
        }
}


