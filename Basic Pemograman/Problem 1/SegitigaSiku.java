package JavaPart1;

import java.util.Scanner;

import static JavaPart1.MainMenu.scanner;

public class SegitigaSiku {
//    public static double main(String[] args) {
//        double luas; double s1 = 0; double s2=0;{
//            return (0.5 * s1 * s2);
//        double sisiMiring;double s1; double s2 ;{
//            return Math.sqrt((s1 * s1) + (s2 * s2));
//        }
//        double s1 = 0;
//        double s2 = 0;
//        double v = 5 * s1 * s2;
//        dou
//        char coba;
//
//        SegitigaSiku segitiga = new SegitigaSiku();
//
//        do {
//            System.out.print("\nMasukan alas segitiga siku-siku: ");
//            s1 = scanner.nextDouble();
//            System.out.print("Masukan tinggi segitiga siku-siku: ");
//            s2 = scanner.nextDouble();
//            System.out.println("Luas segitiga: " +(segitiga.luas);
//            System.out.print("\nIngin mencoba lagi? (y/t) : ");
//            coba = scanner.next().charAt(0);
//            System.out.print("\n");
//        } while (coba == 'Y' || coba == 'y');
//        System.out.print("\n");
//
//    }
//    }
//
//    private luas(double s1, double s2) {
//    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;

        System.out.print("Masukan Alas : ");
        a=input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t=input.nextInt();

        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }
}
